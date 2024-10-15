package lk.ijse.gdse67.pos_system_backend_phase02.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse67.pos_system_backend_phase02.dao.ItemDao;
import lk.ijse.gdse67.pos_system_backend_phase02.dto.impl.ItemDto;
import lk.ijse.gdse67.pos_system_backend_phase02.service.ItemService;
import lk.ijse.gdse67.pos_system_backend_phase02.util.AppUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemDao itemDao;
    @Override
    public void saveItem(ItemDto itemDto) {
        itemDto.setItemId(AppUtil.generateItemId());
        itemDao.save(itemDao)
    }

    @Override
    public void deleteItem(String itemId) {

    }

    @Override
    public void updateItem(String itemId, ItemDto itemDto) {

    }

    @Override
    public void getItem(String itemId) {

    }

    @Override
    public void getAllItem() {

    }
}
