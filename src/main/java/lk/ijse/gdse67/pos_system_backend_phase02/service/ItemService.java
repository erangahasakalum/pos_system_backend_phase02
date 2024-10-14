package lk.ijse.gdse67.pos_system_backend_phase02.service;

import lk.ijse.gdse67.pos_system_backend_phase02.dto.impl.CustomerDto;
import lk.ijse.gdse67.pos_system_backend_phase02.dto.impl.ItemDto;

public interface ItemService {
    void saveItem(ItemDto itemDto);
    void deleteItem(String itemId);
    void updateItem(String itemId,ItemDto itemDto);
    void getItem(String itemId);
    void getAllItem();

}
