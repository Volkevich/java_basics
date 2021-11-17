public class Main {
    public static void main(String[] args) {
        BankAccount accountMax = new BankAccount();
        CardAccount cardAccount = new CardAccount();
        DepositAccount depositAccount = new DepositAccount();
        BankAccount accountOleg = new BankAccount();
        accountMax.put(123);
        accountMax.put(3333);
        accountMax.send(accountOleg,222);
        System.out.println(accountOleg.getAmount());
    }
}
