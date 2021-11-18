import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount accountMax = new BankAccount();
        BankAccount accountOleg = new BankAccount();

        CardAccount cardAccMax = new CardAccount();
        CardAccount cardAccOleg = new CardAccount();

        DepositAccount depositAccMax = new DepositAccount();
        DepositAccount depositAccOleg = new DepositAccount();

        cardAccMax.put(1221);
        System.out.println(cardAccMax.getAmount());
        cardAccMax.send(cardAccOleg,222);
        System.out.println(cardAccOleg.getAmount());

        /*while (true) {
            System.out.println("Выберите пользователя счёта: ");
            System.out.println("1. Максим");
            System.out.println("2. Олег");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            int numberName = Integer.valueOf(name);

            switch (numberName) {
                case 1: {
                    System.out.println(" Вы выбрали счёт пользователя Максим");
                    System.out.println(" Выберите необходимый счёт: ");
                    System.out.println("1. Карт счет");
                    System.out.println("2. Депозитный счет");
                    String shet = scanner.nextLine();
                    int numberShet = Integer.valueOf(shet);
                    switch (numberShet) {
                        case 1: {
                            System.out.println("Вы выбрали карт счёт");
                            System.out.println("Выберите необходимую операцию: ");
                            System.out.println("1. Пополнение счета");
                            System.out.println("2. Списание денежных средств");
                            System.out.println("3. Перевод денежных средств");
                            String numberOper = scanner.nextLine();
                            int numbOper = Integer.valueOf(numberOper);
                            switch (numbOper) {
                                case 1: {
                                    System.out.println("Введите сумму пополнения: ");
                                    String summ = scanner.nextLine();
                                    double sumDouble = Integer.valueOf(summ);
                                    cardAccMax.put(sumDouble);
                                    System.out.println("Баланс успешно пополнен");
                                    break;
                                }

                            }
                            break;
                        }
                        case 2: {
                            System.out.println("Вы выбрали депозитный счёт");
                            System.out.println("Выберите необходимую операцию: ");
                            System.out.println("1. Пополнение счета");
                            System.out.println("2. Списание денежных средств");
                            System.out.println("3. Перевод денежных средств");
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println(" Вы выбрали счёт пользователя Олега, его баланс - " + accountOleg.getAmount());
                    break;
                }
            }
        }*/
    }


}
