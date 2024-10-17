package lk.ijse.gdse67.pos_system_backend_phase02.util;

import java.util.regex.Pattern;

public class RegexProcess {
    public static boolean customerIdMatcher(String customerId) {
        String regexCustomerId = "^CUSTOMER -[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$\n";
        Pattern regexPattern = Pattern.compile(regexCustomerId);
        return regexPattern.matcher(customerId).matches();
    }
    public static boolean itemIdMatcher(String itemId) {
        String regexCustomerId = "^ITEM -[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$\n";
        Pattern regexPattern = Pattern.compile(regexCustomerId);
        return regexPattern.matcher(itemId).matches();
    }
    public static boolean orderIdMatcher(String orderId) {
        String regexCustomerId = "^ORDER -[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$\n";
        Pattern regexPattern = Pattern.compile(regexCustomerId);
        return regexPattern.matcher(orderId).matches();
    }
}
