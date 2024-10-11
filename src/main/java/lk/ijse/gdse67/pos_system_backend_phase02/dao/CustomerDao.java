package lk.ijse.gdse67.pos_system_backend_phase02.dao;

import lk.ijse.gdse67.pos_system_backend_phase02.entity.impl.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends JpaRepository<CustomerEntity ,String> {
}
