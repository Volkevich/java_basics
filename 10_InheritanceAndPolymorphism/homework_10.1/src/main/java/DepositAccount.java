import java.time.LocalDate;
import java.util.Calendar;

public class DepositAccount extends BankAccount {
    LocalDate lastIncome;

    public double getAmount() {
        return super.check;
    }

    public boolean put(double amountToPut) {
        lastIncome = LocalDate.now();
        return super.put(amountToPut);

    }


    public boolean take(double amountToTake) {
        if (LocalDate.now().isAfter(lastIncome.plusMonths(1))) {
            super.take(amountToTake);
        } return true;
    }


    public boolean send(BankAccount receiver, double amount) {

        if ((amount < super.check) && (amount > 0.0)) {
            System.out.println(amount + " руб. успешно переведено на счёт");
            if (LocalDate.now().isAfter(lastIncome.plusMonths(1))) {
                receiver.put(amount * 1.01);
            }
        }

        return true;
    }


}
