package lk.ijse.gdse67.pos_system_backend_phase02.customStatesCodes;

import lk.ijse.gdse67.pos_system_backend_phase02.dto.CustomerStatus;
import lk.ijse.gdse67.pos_system_backend_phase02.dto.ItemStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorStatusCodes implements CustomerStatus , ItemStatus {
    private int statusCode;
    private String statusMassage;
}
