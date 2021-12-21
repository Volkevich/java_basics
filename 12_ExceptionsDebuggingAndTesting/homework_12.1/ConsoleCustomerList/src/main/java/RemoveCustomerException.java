public class RemoveCustomerException extends RuntimeException{
    public RemoveCustomerException() {
    }

    public RemoveCustomerException(String message) {
        super(message);
    }

    public RemoveCustomerException(String message, Throwable cause) {
        super(message, cause);
    }

    public RemoveCustomerException(Throwable cause) {
        super(cause);
    }

    public RemoveCustomerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
