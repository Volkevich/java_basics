import java.time.LocalDate;
import java.util.Calendar;

public class DepositAccount extends BankAccount {
    LocalDate lastIncome;
    public double getAmount() {
        return super.check;
    }
    public void put(double amountToPut) {
        if (amountToPut > 0.0){
            super.check += amountToPut;
            lastIncome = LocalDate.now();
        }


    }
    public void take(double amountToTake) {
        if (LocalDate.now().isAfter(lastIncome.plusMonths(1))){
            if ((super.check > 0.0)&&(amountToTake < super.check)){
                super.check -= amountToTake;
            }
        }else {
            System.out.println("Прошло меньше месяца");
        }



    }
    public boolean send(BankAccount receiver, double amount){

        if ((amount < super.check) && (amount > 0.0)){
            System.out.println(amount + " руб. успешно переведено на счёт");
            receiver.put(amount);
        }

        return true;
    }

}
