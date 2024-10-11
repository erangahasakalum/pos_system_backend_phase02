package lk.ijse.gdse67.pos_system_backend_phase02.dto.impl;
import lk.ijse.gdse67.pos_system_backend_phase02.dto.SuperDto;
import lk.ijse.gdse67.pos_system_backend_phase02.entity.impl.ItemEntity;
import lk.ijse.gdse67.pos_system_backend_phase02.entity.impl.OrderEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDetailsDto implements SuperDto {
    private String id;
    private String orderQty;
    private String unitPrice;
    private OrderEntity order;
    private ItemEntity item;
}
