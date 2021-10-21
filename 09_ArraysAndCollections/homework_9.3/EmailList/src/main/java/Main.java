import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";
    private static EmailList emailList = new EmailList();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            String s = scanner.nextLine();
            if (s.equals("0")) {
                break;
            }

            String regex = "(ADD|add)\\s[a-zA-Z0-9.]+@[a-zA-Z]+\\.[a-z]{2,3}";
            if (s.matches(regex)){
                String[]text = s.split("\\s");
                emailList.add(text[1]);
                System.out.println("Электронная почта успешна добавлена!");
            }
            if (s.equals("LIST")){
                System.out.println("Список электронных почтовых ящиков:");
                emailList.getSortedEmails();
            }

                    //TODO: write code here

                }
            }
        }

