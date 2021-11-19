public class LegalPerson extends Client {
    @Override
    public double getAmount() {
        return check;
    }

    @Override
    public void put(double amountToPut) {
        if (amountToPut > 0.0) {
            check += amountToPut;
        }
    }

    @Override
    public void take(double amountToTake) {
        if ((amountToTake > 0.0) && (amountToTake <= check)) {
            final double pro = amountToTake * 1.01;
            check -= pro;
        }
    }
}
