package fr.aimcvent.castleclash.api.exception;

public class BuildRoleModelException extends RuntimeException {
    public BuildRoleModelException() {
        super();
    }

    public BuildRoleModelException(String message) {
        super(message);
    }

    public BuildRoleModelException(Throwable cause) {
        super(cause);
    }

    public BuildRoleModelException(String message, Throwable cause) {
        super(message, cause);
    }

    public BuildRoleModelException(
        String message,
        Throwable cause,
        boolean enableSuppression,
        boolean writableStackTrace
    ) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
