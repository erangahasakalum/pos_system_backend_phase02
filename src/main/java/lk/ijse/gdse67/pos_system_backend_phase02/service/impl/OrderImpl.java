package lk.ijse.gdse67.pos_system_backend_phase02.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse67.pos_system_backend_phase02.dao.OrderDao;
import lk.ijse.gdse67.pos_system_backend_phase02.dto.ItemStatus;
import lk.ijse.gdse67.pos_system_backend_phase02.dto.OrderStatus;
import lk.ijse.gdse67.pos_system_backend_phase02.dto.impl.OrderDto;
import lk.ijse.gdse67.pos_system_backend_phase02.entity.impl.ItemEntity;
import lk.ijse.gdse67.pos_system_backend_phase02.entity.impl.OrderEntity;
import lk.ijse.gdse67.pos_system_backend_phase02.exception.DataPersistException;
import lk.ijse.gdse67.pos_system_backend_phase02.exception.ItemNotPoundException;
import lk.ijse.gdse67.pos_system_backend_phase02.exception.OrderNotPoundException;
import lk.ijse.gdse67.pos_system_backend_phase02.service.OrderService;
import lk.ijse.gdse67.pos_system_backend_phase02.util.AppUtil;
import lk.ijse.gdse67.pos_system_backend_phase02.util.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class OrderImpl implements OrderService {
    @Autowired
    OrderDao orderDao;

    @Autowired
    Mapping orderMapping;

    public void saveOrder(OrderDto orderDto) {
        orderDto.setOrderId(AppUtil.generateOrderId());
        OrderEntity saveOrder = orderDao.save(orderMapping.toOrderEntity(orderDto));
        if (saveOrder == null){
            throw  new DataPersistException("Order not saved");
        }
    }

    @Override
    public void deleteOrder(String orderId) throws ItemNotPoundException {
        Optional<OrderEntity> tmpOrder = orderDao.findById(orderId);
        if (tmpOrder.isPresent()){
            orderDao.deleteById(orderId);
        }else {
            throw  new OrderNotPoundException("Order ID with " + orderId + " Not Found!");
        }
    }

    @Override
    public void updateOrder(String orderId, OrderDto orderDto) {
    /*    Optional<OrderEntity> tempOrder = orderDao.findById(orderId);
        if (tempOrder.isPresent()){
            tempOrder.get().setDate(orderDto.getDate());
            tempOrder.get().setDiscount(orderDto.getDiscount());
            tempOrder.get().setTotal(orderDto.getTotal());
            tempOrder.get().setBalance(orderDto.getBalance());
            tempOrder.get().setCustomer(orderMapping.toCustomerEntity(orderDto.getCustomerId()));

        }*/
    }

    @Override
    public OrderStatus getSelectedOrder(String orderId) {
        return null;
    }

    @Override
    public List<OrderDto> getAllOrder() {
        List<OrderEntity> allOrders = orderDao.findAll();
        return orderMapping.asOrderDtoList(allOrders);
    }
}
