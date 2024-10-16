package lk.ijse.gdse67.pos_system_backend_phase02.controller;

import lk.ijse.gdse67.pos_system_backend_phase02.dto.impl.ItemDto;
import lk.ijse.gdse67.pos_system_backend_phase02.dto.impl.OrderDto;
import lk.ijse.gdse67.pos_system_backend_phase02.exception.DataPersistException;
import lk.ijse.gdse67.pos_system_backend_phase02.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> saveOrder(@RequestBody OrderDto orderDto) {

        try {
            orderService.saveOrder(orderDto);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (DataPersistException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(value = "/{orderId}")
    public ResponseEntity<Void> deleteOrder(@PathVariable("orderId") String orderId) {
        try {
            orderService.deleteOrder(orderId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (DataPersistException e) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @PutMapping(value = {"/orderId"}, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> updateOrder(@PathVariable("orderId") String orderId, @RequestBody OrderDto orderDto) {
     /*   try {
            orderService.updateOrder(orderId,orderDto);

        }catch (DataPersistException e){

        }catch (Exception e){

        }*/
        return null;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<OrderDto> getAllOrders() {
        return orderService.getAllOrder();
    }
}
