public class LegalPerson extends Client {


    @Override
    public double getAmount() {
        return  check;
    }

    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);
    }

    @Override
    public void take(double amountToTake) {
        if ((amountToTake > 0.0) && (amountToTake <= check)) {
            final double comission = amountToTake * (1 + PERCENT_MORE_PUT_LIMIT);
            check -= comission;
        }

    }
}
