package exceptions;

public class DriverIsNotAnOwnerException extends Exception {
    public DriverIsNotAnOwnerException() {
        super();
    }

    public DriverIsNotAnOwnerException(String message) {
        super(message);
    }
}
