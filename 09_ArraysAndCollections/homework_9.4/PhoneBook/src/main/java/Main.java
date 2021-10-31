import java.util.Scanner;

public class Main {
    private static final String REGEX_NAME = "[а-яА-ЯеЁ]+";
    private static final String REGEX_PHONE = "[\\d]{11}";
    private static final String SAVE_CONTACT = "Контакт сохранён!";
    private static final String ERROR = "Неверный формат ввода";

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        while (true) {
            System.out.println("Ведите номер, имя или команду: ");
            Scanner scanner = new Scanner(System.in);
            String string = scanner.nextLine();


            if (string.matches(REGEX_NAME)) {
                System.out.println("Такого имени в телефоне нет.");
                System.out.println("Введите номер телефона для абонента \"" + string + "\"");
                String newPhone = scanner.nextLine();
                phoneBook.addContact(newPhone, string);
                System.out.println(SAVE_CONTACT);
                continue;

            } else if (string.matches(REGEX_PHONE)) {
                System.out.println("Такого номера в телефоне нет.");
                System.out.println("Введите имя для номера \"" + string + "\"");
                String newName = scanner.nextLine();
                phoneBook.addContact(string, newName);
                System.out.println(SAVE_CONTACT);
                continue;

            } else if (string.equals("LIST")) {
                for (String key : phoneBook.getAllContacts()) {
                    System.out.println(key);
                }
                System.out.println();
                continue;
            } else if (string.equals("0")) {
                break;
            }
            else if (!string.matches(REGEX_PHONE)||!string.matches(REGEX_NAME)){
                System.out.println(ERROR);
                return;
            }

        }


    }
}

