package lk.ijse.gdse67.pos_system_backend_phase02.exception;

public class OrderNotPoundException extends RuntimeException{
    public OrderNotPoundException() {
        super();
    }

    public OrderNotPoundException(String message) {
        super(message);
    }

    public OrderNotPoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
