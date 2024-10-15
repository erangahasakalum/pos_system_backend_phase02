package lk.ijse.gdse67.pos_system_backend_phase02.controller;

import lk.ijse.gdse67.pos_system_backend_phase02.dto.ItemStatus;
import lk.ijse.gdse67.pos_system_backend_phase02.dto.impl.CustomerDto;
import lk.ijse.gdse67.pos_system_backend_phase02.dto.impl.ItemDto;
import lk.ijse.gdse67.pos_system_backend_phase02.exception.DataPersistException;
import lk.ijse.gdse67.pos_system_backend_phase02.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/item")
public class ItemController {
    @Autowired
    ItemService itemService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> saveItem(@RequestBody ItemDto itemDto){

        try {
            itemService.saveItem(itemDto);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (DataPersistException e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(value = "/{itemId}")
    public ResponseEntity<Void> deleteItem(@PathVariable ("itemId") String itemId){

        try {
            itemService.deleteItem(itemId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }catch (DataPersistException e){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping(value = "/{itemId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void>  updateItem(@PathVariable("itemId") String itemId,@RequestBody ItemDto itemDto) {
        try {
            itemService.updateItem(itemId, itemDto);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (DataPersistException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
