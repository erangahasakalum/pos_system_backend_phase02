package lk.ijse.gdse67.pos_system_backend_phase02.service;

import lk.ijse.gdse67.pos_system_backend_phase02.dto.ItemStatus;
import lk.ijse.gdse67.pos_system_backend_phase02.dto.OrderStatus;
import lk.ijse.gdse67.pos_system_backend_phase02.dto.impl.ItemDto;
import lk.ijse.gdse67.pos_system_backend_phase02.dto.impl.OrderDto;
import lk.ijse.gdse67.pos_system_backend_phase02.exception.ItemNotPoundException;

import java.util.List;

public interface OrderService {
    void saveOrder(OrderDto orderDto);
    void deleteOrder(String orderId) throws ItemNotPoundException;
    void updateOrder(String orderId,OrderDto orderDto);
    OrderStatus getSelectedOrder(String orderId);
    List<OrderDto> getAllOrder();
}
