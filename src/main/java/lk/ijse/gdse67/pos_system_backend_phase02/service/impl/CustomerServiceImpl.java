package lk.ijse.gdse67.pos_system_backend_phase02.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse67.pos_system_backend_phase02.dao.CustomerDao;
import lk.ijse.gdse67.pos_system_backend_phase02.dto.impl.CustomerDto;
import lk.ijse.gdse67.pos_system_backend_phase02.entity.impl.CustomerEntity;
import lk.ijse.gdse67.pos_system_backend_phase02.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerDao customerDao;
    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {

    }

    @Override
    public void updateCustomer(String customerId, CustomerDto customerDto) {

    }

    @Override
    public void deleteCustomer(String customerId) {

    }

    @Override
    public void getCustomer(String customerId) {

    }

    @Override
    public List<CustomerDto> getAllCustomer() {
        return null;
    }
}
