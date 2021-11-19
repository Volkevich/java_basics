public class CardAccount extends BankAccount {
    public double getAmount() {
        return super.getAmount();
    }

    // метод зачисляет деньги на счет
    public boolean take(double amountToTake) {
        return super.take(amountToTake * 1.01);

    }

    public boolean send(BankAccount receiver, double amount) {

        if ((amount < super.check) && (amount > 0.0)) {
            System.out.println(amount + " руб. успешно переведено на счёт");
            receiver.put(amount * 1.01);
            return true;
        } else {
            return false;
        }

    }
    // не забывайте, обращаться к методам и конструкторам родителя
    // необходимо используя super, например, super.put(10D);
}
