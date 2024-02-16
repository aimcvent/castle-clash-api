package fr.aimcvent.castleclash.api.exception;

public class RegisterHandlerModelException extends RuntimeException {
    public RegisterHandlerModelException() {
        super();
    }

    public RegisterHandlerModelException(String message) {
        super(message);
    }

    public RegisterHandlerModelException(Throwable cause) {
        super(cause);
    }

    public RegisterHandlerModelException(String message, Throwable cause) {
        super(message, cause);
    }

    public RegisterHandlerModelException(
        String message,
        Throwable cause,
        boolean enableSuppression,
        boolean writableStackTrace
    ) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
