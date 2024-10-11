package lk.ijse.gdse67.pos_system_backend_phase02.entity.impl;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "orderdetail")
@Entity
public class OrderDetailEntity {

    @Id
    private String id;
    private String orderQty;
    private String unitPrice;
    @ManyToOne
    @JoinColumn(name = "orderId")
    private OrderEntity order;
    @ManyToOne
    @JoinColumn(name = "itemId")
    private ItemEntity item;
}
