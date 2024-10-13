package lk.ijse.gdse67.pos_system_backend_phase02.dto.impl;

import lk.ijse.gdse67.pos_system_backend_phase02.dto.CustomerStatus;
import lk.ijse.gdse67.pos_system_backend_phase02.dto.SuperDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDto implements SuperDto, CustomerStatus {
    private String customerId;
    private String name;
    private String city;
    private String tel;
    private List<OrderDto> orderList;
}
