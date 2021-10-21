import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";
    private static EmailList emailList = new EmailList();
    
    /* TODO:
        Пример вывода списка Email, после ввода команды LIST в консоль:
        test@test.com
        hello@mail.ru
        - каждый адрес с новой строки
        - список должен быть отсортирован по алфавиту
        - email в разных регистрах считается одинаковыми
           hello@skillbox.ru == HeLLO@SKILLbox.RU
        - вывод на печать должен быть в нижнем регистре
           hello@skillbox.ru
        Пример вывода сообщения об ошибке при неверном формате Email:
        "Неверный формат email"
    */

    public static void main(String[] args) {
        while (true) {

            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();

            final Pattern pattern = Pattern.compile("(LIST|ADD)\\s?([a-zA-Z0-9]+@[a-zA-Z]+\\.[a-z])");
            Matcher matcher = pattern.matcher(s);
            while (matcher.matches()) {
                if (matcher.group(1).equals("ADD")) {
                    emailList.add(matcher.group(2));
                    break;
                } else {
                    System.out.println(WRONG_EMAIL_ANSWER);
                }
                if (matcher.group(1).equals("LIST")) {
                    List<String> sortedEmail = emailList.getSortedEmails();
                    for (String str : sortedEmail) {
                        System.out.println(str);
                        break;
                    }

                    if (s.equals("0")) {
                        break;
                    }
                }

                //TODO: write code here

            }
        }
    }
}
