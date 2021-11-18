import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount accountMax = new BankAccount();
        BankAccount accountOleg = new BankAccount();

        CardAccount cardAccMax = new CardAccount();
        CardAccount cardAccOleg = new CardAccount();

        DepositAccount depositAccMax = new DepositAccount();
        DepositAccount depositAccOleg = new DepositAccount();

        System.out.println("Выберите пользователя счёта: ");
        System.out.println("1. Максим");
        System.out.println("2. Олег");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int numberName = Integer.valueOf(name);
        switch (numberName){
            case 1 :
                System.out.println(" Вы выбрали счёт пользователя Максим, его баланс - " + accountMax.getAmount());
                System.out.println(" Выберите необходимый счёт: ");
                System.out.println("1. Карт счет");
                System.out.println("2. Депозитный счет");
                String chet = scanner.nextLine();
                int numberChet = Integer.valueOf(chet);
                switch (numberChet){
                    case 1:
                        System.out.println("Вы выбрали карт счёт");
                        System.out.println("Выберите необходимую операцию: ");
                        System.out.println("1. Пополнение счета");
                        System.out.println("2. Списание денежных средств");
                        System.out.println("3. Перевод денежных средств");
                }
            case 2 :
                System.out.println(accountOleg.getAmount() + " остаток на счету Олега");
        }
    }

}
