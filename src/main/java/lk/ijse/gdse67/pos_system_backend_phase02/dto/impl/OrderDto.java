package lk.ijse.gdse67.pos_system_backend_phase02.dto.impl;
import lk.ijse.gdse67.pos_system_backend_phase02.dto.SuperDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDto implements SuperDto {
    private String orderId;
    private String date;
    private double discount;
    private double total;
    private double balance;
    private CustomerDto customerId;
    private List<OrderDetailsDto> orderDetails;
}
