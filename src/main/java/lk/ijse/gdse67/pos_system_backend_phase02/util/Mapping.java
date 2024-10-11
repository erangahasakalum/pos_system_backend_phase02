package lk.ijse.gdse67.pos_system_backend_phase02.util;

import lk.ijse.gdse67.pos_system_backend_phase02.dto.impl.CustomerDto;
import lk.ijse.gdse67.pos_system_backend_phase02.entity.impl.CustomerEntity;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Mapping {
        @Autowired
        private ModelMapper modelMapper;
        public CustomerEntity toCustomerEntity(CustomerDto customerDto){
            return modelMapper.map(customerDto, CustomerEntity.class);
        }
        public CustomerDto toCustomerDto(CustomerEntity customerEntity){
            return modelMapper.map(customerEntity, CustomerDto.class);
        }
        public List<CustomerDto> asCustomerDtoList(List<CustomerEntity> list){
            return modelMapper.map(list, new TypeToken<List<CustomerDto>>() {
            }.getType());
        }
}
