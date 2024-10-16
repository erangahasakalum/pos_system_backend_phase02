package lk.ijse.gdse67.pos_system_backend_phase02.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse67.pos_system_backend_phase02.customStatesCodes.ErrorStatusCodes;
import lk.ijse.gdse67.pos_system_backend_phase02.dao.CustomerDao;
import lk.ijse.gdse67.pos_system_backend_phase02.dto.CustomerStatus;
import lk.ijse.gdse67.pos_system_backend_phase02.dto.impl.CustomerDto;
import lk.ijse.gdse67.pos_system_backend_phase02.entity.impl.CustomerEntity;
import lk.ijse.gdse67.pos_system_backend_phase02.exception.CustomerNotPoundException;
import lk.ijse.gdse67.pos_system_backend_phase02.exception.DataPersistException;
import lk.ijse.gdse67.pos_system_backend_phase02.service.CustomerService;
import lk.ijse.gdse67.pos_system_backend_phase02.util.AppUtil;
import lk.ijse.gdse67.pos_system_backend_phase02.util.Mapping;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerDao customerDao;

    @Autowired
    Mapping customerMapping;
    @Override
    public void saveCustomer(CustomerDto customerDto) {
//        customerDto.setCustomerId(AppUtil.generateCustomerId());
        CustomerEntity saveCustomer = customerDao.save(customerMapping.toCustomerEntity(customerDto));
        if (saveCustomer == null){
            throw new DataPersistException("Customer Not Saved");
        }
    }

    @Override
    public void updateCustomer(String customerId, CustomerDto customerDto) {
        Optional<CustomerEntity> tempCustomer = customerDao.findById(customerId);
        if (tempCustomer.isPresent()){
            tempCustomer.get().setName(customerDto.getName());
            tempCustomer.get().setCity(customerDto.getCity());
            tempCustomer.get().setTel(customerDto.getTel());
        }
    }

    @Override
    public void deleteCustomer(String customerId) {
        Optional<CustomerEntity> tmpCustomer = customerDao.findById(customerId);
        if (tmpCustomer.isPresent()){
            customerDao.deleteById(customerId);
        }else {
            throw new CustomerNotPoundException("Customer ID with " + customerId + "Not Found!");
        }

    }

    @Override
    public CustomerStatus getCustomer(String customerId) {
        if (customerDao.existsById(customerId)){
            CustomerEntity referenceById = customerDao.getReferenceById(customerId);
            return customerMapping.toCustomerDto(referenceById);
        }else {
            return new ErrorStatusCodes( 2, "selected id not found");
        }
    }

    @Override
    public List<CustomerDto> getAllCustomer() {
        return customerMapping.asCustomerDtoList( customerDao.findAll());
    }
}
