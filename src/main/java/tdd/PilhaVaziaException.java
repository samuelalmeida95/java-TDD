package tdd;

public class PilhaVaziaException extends RuntimeException{

    public PilhaVaziaException(String message) {
        super(message);
    }

    public PilhaVaziaException(String message, Throwable cause) {
        super(message, cause);
    }

}
