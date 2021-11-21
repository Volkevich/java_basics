public abstract class Client {
    protected final double PERCENT_MORE_PUT_LIMIT = 0.01;
    protected final double PERCENT_MORE_PUT_LIMIT_TWO = 0.005;
    protected double check;
    protected final double PUT_LIMIT = 0.0;

    public abstract double getAmount();

    protected void put(double amountToPut){
        if (amountToPut > PUT_LIMIT) {
            check += amountToPut;
        }
    }

    protected void take(double amountToTake){
        if ((amountToTake > PUT_LIMIT) && (amountToTake <= check)) {
            check -= amountToTake;
        }
    }


}
