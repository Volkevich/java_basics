public class BankAccount {


  protected double check;
  public double getAmount() {
    // верните значение количества денег не счету
    return check;
  }

  public void put(double amountToPut) {
    if (amountToPut > 0.0){
      check += amountToPut;
    }

    // метод зачисляет деньги на счет
  }

  public void take(double amountToTake) {
    if ((check > 0.0)&&(amountToTake < check)){
      check -= amountToTake;
    }

    // метод списывает деньги со счета
  }
  public boolean send(BankAccount receiver, double amount){

    if ((amount < check) && (amount > 0.0)){
       receiver.put(amount);

    }

    return true;
  }
}
