package lk.ijse.gdse67.pos_system_backend_phase02.entity.impl;

import jakarta.persistence.*;
import lk.ijse.gdse67.pos_system_backend_phase02.entity.SuperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "item")
@Entity
public class ItemEntity implements SuperEntity {
    @Id
    private String itemId;
    private String name;
    private String quantity;
    private String price;
    @OneToMany(mappedBy = "item",cascade = CascadeType.ALL)
    private List<OrderDetailEntity> orderList;

}
