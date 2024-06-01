package fr.aimcvent.castleclash.api.exception;

public class RegisterModelException extends RuntimeException {
    public RegisterModelException() {
        super();
    }

    public RegisterModelException(String message) {
        super(message);
    }

    public RegisterModelException(Throwable cause) {
        super(cause);
    }

    public RegisterModelException(String message, Throwable cause) {
        super(message, cause);
    }

    public RegisterModelException(
        String message,
        Throwable cause,
        boolean enableSuppression,
        boolean writableStackTrace
    ) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
