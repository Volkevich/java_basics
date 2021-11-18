public class BankAccount {


  protected double check;

  protected double getAmount() {
    // верните значение количества денег не счету
    return check;
  }

  protected boolean put(double amountToPut) {
    if (amountToPut > 0.0) {
      check += amountToPut;
      return true;
    } else {
      return false;
    }

    // метод зачисляет деньги на счет
  }

  protected boolean take(double amountToTake) {
    if ((amountToTake > 0.0) && (amountToTake <= check)) {
      check -= amountToTake;
      return true;
    } else {
      return false;
    }

    // метод списывает деньги со счета
  }

  protected boolean send(BankAccount receiver, double amount) {
    if (take(amount)) {
      receiver.put(amount);
      return true;
    } else {
      return false;
    }
  }
}
