package fr.aimcvent.castleclash.api.exception;

public class BuildModelException extends RuntimeException {
    public BuildModelException() {
        super();
    }

    public BuildModelException(String message) {
        super(message);
    }

    public BuildModelException(Throwable cause) {
        super(cause);
    }

    public BuildModelException(String message, Throwable cause) {
        super(message, cause);
    }

    public BuildModelException(
        String message,
        Throwable cause,
        boolean enableSuppression,
        boolean writableStackTrace
    ) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
