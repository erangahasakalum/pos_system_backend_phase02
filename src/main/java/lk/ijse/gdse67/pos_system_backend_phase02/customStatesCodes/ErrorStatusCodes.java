package lk.ijse.gdse67.pos_system_backend_phase02.customStatesCodes;

import lk.ijse.gdse67.pos_system_backend_phase02.dto.CustomerStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorStatusCodes implements CustomerStatus {
    private int statusCode;
    private String statusMassage;
}
