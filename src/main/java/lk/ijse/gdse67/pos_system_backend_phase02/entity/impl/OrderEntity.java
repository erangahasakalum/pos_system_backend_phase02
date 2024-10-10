package lk.ijse.gdse67.pos_system_backend_phase02.entity.impl;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "order")
@Entity
public class OrderEntity {
    @Id
    private String orderId;
    private String date;
    private double discount;
    private double total;
    private double balance;
    @ManyToOne
    private CustomerEntity customer;

}
