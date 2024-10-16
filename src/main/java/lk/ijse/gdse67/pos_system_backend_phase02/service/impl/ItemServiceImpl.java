package lk.ijse.gdse67.pos_system_backend_phase02.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse67.pos_system_backend_phase02.customStatesCodes.ErrorStatusCodes;
import lk.ijse.gdse67.pos_system_backend_phase02.dao.ItemDao;
import lk.ijse.gdse67.pos_system_backend_phase02.dto.CustomerStatus;
import lk.ijse.gdse67.pos_system_backend_phase02.dto.ItemStatus;
import lk.ijse.gdse67.pos_system_backend_phase02.dto.impl.CustomerDto;
import lk.ijse.gdse67.pos_system_backend_phase02.dto.impl.ItemDto;
import lk.ijse.gdse67.pos_system_backend_phase02.entity.impl.CustomerEntity;
import lk.ijse.gdse67.pos_system_backend_phase02.entity.impl.ItemEntity;
import lk.ijse.gdse67.pos_system_backend_phase02.exception.CustomerNotPoundException;
import lk.ijse.gdse67.pos_system_backend_phase02.exception.DataPersistException;
import lk.ijse.gdse67.pos_system_backend_phase02.exception.ItemNotPoundException;
import lk.ijse.gdse67.pos_system_backend_phase02.service.ItemService;
import lk.ijse.gdse67.pos_system_backend_phase02.util.AppUtil;
import lk.ijse.gdse67.pos_system_backend_phase02.util.Mapping;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemDao itemDao;

    @Autowired
    Mapping itemMapping;
    @Override
    public void saveItem(ItemDto itemDto) {
        itemDto.setItemId(AppUtil.generateItemId());
        ItemEntity saveItem = itemDao.save(itemMapping.toItemEntity(itemDto));
        if (saveItem == null){
            throw  new DataPersistException("Item not saved");
        }
    }

    @Override
    public void deleteItem(String itemId){
        Optional<ItemEntity> tmpItem = itemDao.findById(itemId);
        if (tmpItem.isPresent()){
            itemDao.deleteById(itemId);
        }else {
            throw new ItemNotPoundException("Customer ID with " + itemId + " Not Found!");
        }
    }

    @Override
    public void updateItem(String itemId, ItemDto itemDto) {
        Optional<ItemEntity> tempItem = itemDao.findById(itemId);
        if (tempItem.isPresent()){
            tempItem.get().setName(itemDto.getName());
            tempItem.get().setQuantity(itemDto.getQuantity());
            tempItem.get().setPrice(itemDto.getPrice());
        }
    }


    @Override
    public ItemStatus getItem(String itemId) {
        if (itemDao.existsById(itemId)) {
            ItemEntity referenceById = itemDao.getReferenceById(itemId);
            return itemMapping.toItemDto(referenceById);
        } else {
            return new ErrorStatusCodes(2, "selected id not found");
        }

    }


    @Override
    public List<ItemDto> getAllItem() {
        List<ItemEntity> allItem = itemDao.findAll();
        return itemMapping.asItemDtoList(allItem);
    }
}
