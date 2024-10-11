package lk.ijse.gdse67.pos_system_backend_phase02.exception;

public class CustomerNotPoundException extends RuntimeException{
    public CustomerNotPoundException() {
        super();
    }

    public CustomerNotPoundException(String message) {
        super(message);
    }

    public CustomerNotPoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
