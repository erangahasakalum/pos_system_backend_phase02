package lk.ijse.gdse67.pos_system_backend_phase02.dao;

import lk.ijse.gdse67.pos_system_backend_phase02.entity.impl.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDao extends JpaRepository<OrderEntity ,String>{
}
