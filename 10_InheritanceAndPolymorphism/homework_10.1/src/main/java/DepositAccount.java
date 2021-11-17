import java.util.Calendar;

public class DepositAccount extends BankAccount {
    protected double checkDeposit;
    public double getAmount() {
        return checkDeposit;
    }
    public void put(double amountToPut) {
        if (amountToPut > 0.0){
            checkDeposit += amountToPut;
        }


    }
    public void take(double amountToTake) {
        if ((checkDeposit > 0.0)&&(amountToTake < checkDeposit)){
            checkDeposit -= amountToTake;
        }

    }

}
