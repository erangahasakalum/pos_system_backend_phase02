package lk.ijse.gdse67.pos_system_backend_phase02.service;

import lk.ijse.gdse67.pos_system_backend_phase02.dto.CustomerStatus;
import lk.ijse.gdse67.pos_system_backend_phase02.dto.ItemStatus;
import lk.ijse.gdse67.pos_system_backend_phase02.dto.impl.CustomerDto;
import lk.ijse.gdse67.pos_system_backend_phase02.dto.impl.ItemDto;
import lk.ijse.gdse67.pos_system_backend_phase02.exception.ItemNotPoundException;

public interface ItemService {
    void saveItem(ItemDto itemDto);
    void deleteItem(String itemId) throws ItemNotPoundException;
    void updateItem(String itemId,ItemDto itemDto);
    ItemStatus getItem(String itemId);
    void getAllItem();

}
