package fr.aimcvent.castleclash.api.exception;

public class BuildHandlerModelException extends RuntimeException {
    public BuildHandlerModelException() {
        super();
    }

    public BuildHandlerModelException(String message) {
        super(message);
    }

    public BuildHandlerModelException(Throwable cause) {
        super(cause);
    }

    public BuildHandlerModelException(String message, Throwable cause) {
        super(message, cause);
    }

    public BuildHandlerModelException(
        String message,
        Throwable cause,
        boolean enableSuppression,
        boolean writableStackTrace
    ) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
