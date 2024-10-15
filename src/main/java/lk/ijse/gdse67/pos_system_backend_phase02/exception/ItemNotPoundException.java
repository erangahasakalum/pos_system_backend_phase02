package lk.ijse.gdse67.pos_system_backend_phase02.exception;

public class ItemNotPoundException extends RuntimeException{
    public ItemNotPoundException() {
        super();
    }

    public ItemNotPoundException(String message) {
        super(message);
    }

    public ItemNotPoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
