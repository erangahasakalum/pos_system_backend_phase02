package lk.ijse.gdse67.pos_system_backend_phase02.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse67.pos_system_backend_phase02.dto.ItemStatus;
import lk.ijse.gdse67.pos_system_backend_phase02.dto.OrderStatus;
import lk.ijse.gdse67.pos_system_backend_phase02.dto.impl.OrderDto;
import lk.ijse.gdse67.pos_system_backend_phase02.exception.ItemNotPoundException;
import lk.ijse.gdse67.pos_system_backend_phase02.service.OrderService;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Transactional
public class OrderImpl implements OrderService {
    @Override
    public void saveOrder(OrderDto orderDto) {

    }

    @Override
    public void deleteOrder(String orderId) throws ItemNotPoundException {

    }

    @Override
    public void updateOrder(String orderId, OrderDto orderDto) {

    }

    @Override
    public OrderStatus getSelectedOrder(String orderId) {
        return null;
    }

    @Override
    public List<OrderDto> getAllOrder() {
        return null;
    }
}
