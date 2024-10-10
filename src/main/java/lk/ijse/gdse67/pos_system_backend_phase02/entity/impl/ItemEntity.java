package lk.ijse.gdse67.pos_system_backend_phase02.entity.impl;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lk.ijse.gdse67.pos_system_backend_phase02.entity.SuperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemEntity implements SuperEntity {

    private String itemId;
    private String name;
    private String quantity;
    private String price;

}
