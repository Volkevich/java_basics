import java.util.*;

public class Main {


    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Введите номер, имя или команду:");
            String s = scanner.nextLine();
            phoneBook.controller(s);

        }

    }
}