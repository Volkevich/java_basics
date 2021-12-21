public class CustomerAddException extends RuntimeException{
    public CustomerAddException() {
    }

    public CustomerAddException(String message) {
        super(message);
    }

    public CustomerAddException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomerAddException(Throwable cause) {
        super(cause);
    }

    public CustomerAddException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

