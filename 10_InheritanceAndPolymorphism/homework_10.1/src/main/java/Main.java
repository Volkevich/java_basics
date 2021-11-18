public class Main {
    public static void main(String[] args) {
        BankAccount accountMax = new BankAccount();
        BankAccount accountOleg = new BankAccount();

        CardAccount cardAccMax = new CardAccount();
        CardAccount cardAccOleg = new CardAccount();

        DepositAccount depositAccMax = new DepositAccount();
        DepositAccount depositAccOleg = new DepositAccount();

        System.out.println("Выберите одну из команд: ");


        accountMax.put(10000);
        accountMax.send(accountOleg,500);
        System.out.println("Остаток на счёте - " + accountOleg.getAmount() + " руб.");
    }

}
