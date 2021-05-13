package tdd;

public class PilhaCheiaException extends RuntimeException{

    public PilhaCheiaException(String message) {
        super(message);
    }

    public PilhaCheiaException(String message, Throwable cause) {
        super(message, cause);
    }
}
