public class IndividualBusinessman extends Client {


    @Override
    public double getAmount() {
        return check;
    }

    @Override
    public void put(double amountToPut) {
        if (amountToPut > PUT_LIMIT) {
            if (amountToPut < 1000) {
                final double percent = amountToPut * (1 + PERCENT_MORE_PUT_LIMIT);
                check += amountToPut - percent;
            }
            if (amountToPut >= 1000) {
                final double percent = amountToPut * (1 + PERCENT_MORE_PUT_LIMIT_TWO);
                check += amountToPut - percent;
            }
            check += amountToPut;
        }
    }

    @Override
    public void take(double amountToTake) {
        super.take(amountToTake);
    }
}
