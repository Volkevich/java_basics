public class Main {
    public static void main(String[] args) {
        BankAccount accountMax = new BankAccount();
        BankAccount accountOleg = new BankAccount();

        CardAccount cardAccMax = new CardAccount();
        CardAccount cardAccOleg = new CardAccount();

        DepositAccount depositAccMax = new DepositAccount();
        DepositAccount depositAccOleg = new DepositAccount();


        accountMax.put(200);
        cardAccMax.put(300);
        cardAccMax.take(100);
        cardAccMax.send(cardAccOleg,100);
        depositAccMax.put(1221);
        depositAccMax.put(1111);


        System.out.println(cardAccMax.getAmount() + " -  карт счет Максима");
        System.out.println(cardAccOleg.getAmount() + " -  карт счёт Олега");
        System.out.println(accountMax.getAmount() + " -  счёт Максима");
        System.out.println(accountOleg.getAmount() + " -  счёт Олега");
        System.out.println(depositAccMax.getAmount() + " - депозитный счёт Максима");
        System.out.println(depositAccOleg.getAmount() + " - депозитный счёт Олега");
    }
}



