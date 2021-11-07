import java.util.*;

public class Main {


    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);
        final String REGEX_NAME = "[а-яА-ЯеЁ]+";
        final String REGEX_PHONE = "[\\d]{11}";
        final String ERROR = "Неверный формат ввода";
        while(true){
            System.out.println("Введите номер, имя или команду:");
            String s = scanner.nextLine();

            if (s.matches(REGEX_PHONE)) {
                if (phoneBook.search(s)) {
                    System.out.println("Такой номер телефона найден:");
                    System.out.println(String.join(", ", phoneBook.getContactByPhone(s)));
                    System.out.println("Введите новое имя для номера \"" + s + "\":");
                    phoneBook.renameNumber(s);
                } else {
                    System.out.println("Такого номера нет в телефонной книге.");
                    System.out.println("Введите имя для номера \"" + s + "\"");
                    phoneBook.inputName(s);
                    System.out.println("Контакт сохранен!");
                }

            } else if (s.matches(REGEX_NAME)) {
                if (phoneBook.search(s))
                    System.out.println(String.join(", ", phoneBook.getContactByName(s)));
                else {
                    System.out.println("Такого имени в телефонной книге нет.");
                    System.out.println("Введите номер телефона для абонента \"" + s + "\"");
                    phoneBook.inputNumber(s);
                    System.out.println("Контакт сохранен!");
                }
            } else if (s.equals("LIST")) {
                if (phoneBook.getAllContacts().isEmpty()){
                    System.out.println("Телефонная книга пуста!");
                }
                System.out.println(String.join(", ", phoneBook.getAllContacts()));

            } else {
                System.out.println(ERROR + "\n");
            }



        }

    }
}