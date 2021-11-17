public class CardAccount extends BankAccount {
    protected double checkCard;
    public double getAmount() {
        return  checkCard;
    }
    public void put(double amountToPut) {
        if (amountToPut > 0.0){
           checkCard += amountToPut;
        }

    }
    public void take(double amountToTake) {
        double commission = ((amountToTake / 100) * 1);
        if ((checkCard > 0.0)&&(amountToTake < checkCard)){
            System.out.println("На счете Card Account - " + checkCard + " руб.");
            System.out.println("Вы хотите снять - " + amountToTake+ " руб.");
            System.out.println("Комиссия за снятие - " + commission + " руб.");
            checkCard -=  (amountToTake) + commission;
        }else {
            System.out.println("Сумма на счете не соответствует ожидаемой");
        }
    }
    // не забывайте, обращаться к методам и конструкторам родителя
    // необходимо используя super, например, super.put(10D);
}
