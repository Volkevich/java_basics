public class CardAccount extends BankAccount {
    public double getAmount() {
        return  super.check;
    }

    public void put(double amountToPut) {
        if (amountToPut > 0.0){
           super.check += amountToPut;
        }

    }
    public void take(double amountToTake) {
        double commission = ((amountToTake / 100) * 1);
        if ((super.check > 0.0)&&(amountToTake < super.check)){
            System.out.println("На счете - " + super.check + " руб.");
            System.out.println("Вы хотите снять - " + amountToTake+ " руб.");
            System.out.println("Комиссия за снятие - " + commission + " руб.");
            super.check -=  (amountToTake) + commission;
        }else {
            System.out.println("Сумма на счете не соответствует ожидаемой");
        }
    }
    public boolean send(BankAccount receiver, double amount){

        if ((amount < super.check) && (amount > 0.0)){
            System.out.println(amount + " руб. успешно переведено на счёт");
            receiver.put(amount);
        }

        return true;
    }
    // не забывайте, обращаться к методам и конструкторам родителя
    // необходимо используя super, например, super.put(10D);
}
