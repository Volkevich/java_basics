public class Main {
    public static void main(String[] args) {
        BankAccount accountMax = new BankAccount();
        CardAccount cardAccount = new CardAccount();
        DepositAccount depositAccount = new DepositAccount();
        BankAccount accountOleg = new BankAccount();
        cardAccount.put(12321);
        cardAccount.take(100);
        System.out.println(cardAccount.getAmount());
    }
}
