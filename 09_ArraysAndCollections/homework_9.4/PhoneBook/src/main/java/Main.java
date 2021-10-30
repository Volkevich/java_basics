import java.util.Scanner;

public class Main {
    private static final String REGEX_NAME = "[а-яА-ЯеЁ]+";
    private static final String REGEX_PHONE = "[\\d]{10}";
    private static final String SAVE_CONTACT = "Контакт сохранён!";
    private static final String ERROR = "Неверный формат ввода";

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        while (true) {
            System.out.println("Ведите номер, имя или команду: ");
            Scanner scanner = new Scanner(System.in);
            String string = scanner.nextLine();


            if (string.matches(REGEX_NAME)&&!phoneBook.mapPhoneBook.containsValue(string)){
                    System.out.println("Такого имени в телефоне нет.");
                    System.out.println("Введите номер телефона для абонента \"" + string + "\"");
                    String newName = scanner.nextLine();
                    phoneBook.addContact(newName,string);
                    System.out.println(SAVE_CONTACT);
                    continue;
                }else if (string.matches(REGEX_PHONE)&&!phoneBook.mapPhoneBook.containsKey(string)){
                    System.out.println("Такого номера в телефоне нет.");
                    System.out.println("Введите имя для номера \"" + string + "\"");
                    String newPhone = scanner.nextLine();
                    phoneBook.addContact(string,newPhone);
                    System.out.println(SAVE_CONTACT);
                    continue;
                }
            else if (string.equals("LIST")) {
                for (String key : phoneBook.getAllContacts()) {
                    System.out.println(key);
                }
                System.out.println();
                continue;
            }else if (string.equals("0")){
                break;
            }
        }


    }
}

