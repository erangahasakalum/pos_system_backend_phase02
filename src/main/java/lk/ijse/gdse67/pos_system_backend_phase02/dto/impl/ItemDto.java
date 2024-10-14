package lk.ijse.gdse67.pos_system_backend_phase02.dto.impl;
import lk.ijse.gdse67.pos_system_backend_phase02.dto.ItemStatus;
import lk.ijse.gdse67.pos_system_backend_phase02.dto.SuperDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemDto implements ItemStatus {
    private String itemId;
    private String name;
    private String quantity;
    private String price;
    private List<OrderDetailsDto> orderDetailsList;

}
