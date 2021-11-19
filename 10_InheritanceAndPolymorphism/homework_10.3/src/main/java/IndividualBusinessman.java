public class IndividualBusinessman extends Client {
    @Override
    public double getAmount() {
        return check;
    }

    @Override
    public void put(double amountToPut) {
        if (amountToPut > 0.0) {
            if (amountToPut < 1000) {
                final double percent = amountToPut * 1.01;
                check += amountToPut - percent;
            }
            if (amountToPut >= 1000) {
                final double percent = amountToPut * 1.005;
                check += amountToPut - percent;
            }
            check += amountToPut;
        }
    }

    @Override
    public void take(double amountToTake) {
        if ((amountToTake > 0.0) && (amountToTake <= check)) {
            check -= amountToTake;
        }
    }
}
