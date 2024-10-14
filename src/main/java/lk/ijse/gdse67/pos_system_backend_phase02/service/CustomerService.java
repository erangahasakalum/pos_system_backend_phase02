package lk.ijse.gdse67.pos_system_backend_phase02.service;

import lk.ijse.gdse67.pos_system_backend_phase02.dto.CustomerStatus;
import lk.ijse.gdse67.pos_system_backend_phase02.dto.impl.CustomerDto;

import java.util.List;

public interface CustomerService {
    void saveCustomer(CustomerDto customerDto);
    void updateCustomer(String customerId,CustomerDto customerDto);
    void deleteCustomer(String customerId);
    CustomerStatus getCustomer(String customerId);
    List<CustomerDto> getAllCustomer();
}
