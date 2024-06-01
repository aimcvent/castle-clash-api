package fr.aimcvent.castleclash.api.exception;

public class RoleModelNotFoundException extends RuntimeException {
    public RoleModelNotFoundException() {
        super();
    }

    public RoleModelNotFoundException(String message) {
        super(message);
    }

    public RoleModelNotFoundException(Throwable cause) {
        super(cause);
    }

    public RoleModelNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public RoleModelNotFoundException(
        String message,
        Throwable cause,
        boolean enableSuppression,
        boolean writableStackTrace
    ) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
