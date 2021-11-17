import java.util.Calendar;

public class DepositAccount extends BankAccount {
    public double getAmount() {
        return super.check;
    }
    public void put(double amountToPut) {
        if (amountToPut > 0.0){
            super.check += amountToPut;
        }


    }
    public void take(double amountToTake) {
        if ((super.check > 0.0)&&(amountToTake < super.check)){
            super.check -= amountToTake;
        }

    }

}
