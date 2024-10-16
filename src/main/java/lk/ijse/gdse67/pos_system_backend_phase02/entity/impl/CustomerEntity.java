package lk.ijse.gdse67.pos_system_backend_phase02.entity.impl;

import jakarta.persistence.*;
import lk.ijse.gdse67.pos_system_backend_phase02.entity.SuperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Table(name = "customer")
@Entity
public class CustomerEntity implements SuperEntity {
    @Id
    private String customerId;
    private String name;
    private String city;
    private String tel;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<OrderEntity> orderList;


}
