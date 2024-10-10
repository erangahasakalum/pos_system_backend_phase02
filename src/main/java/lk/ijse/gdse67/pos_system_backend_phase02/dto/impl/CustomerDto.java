package lk.ijse.gdse67.pos_system_backend_phase02.dto.impl;

import lk.ijse.gdse67.pos_system_backend_phase02.dto.SuperDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDto implements SuperDto {
    private String id;
    private String name;
    private String city;
    private String telephone;
}
