package lk.ijse.gdse67.pos_system_backend_phase02.util;

import java.util.UUID;

public class AppUtil {
    public static String generateCustomerId(){
        return "CUSTOMER -"+UUID.randomUUID();
    }


}
