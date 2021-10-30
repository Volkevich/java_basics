import java.util.List;
import java.util.Objects;
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
                System.out.println("Выход!");
            }
            final Pattern pattern = Pattern.compile("(ADD|LIST)\\s?([a-zA-Z0-9.]+@[a-zA-Z]+\\.[a-z]{2,3})?");
            Matcher matcher = pattern.matcher(s);
            if (matcher.matches()) {

                String command = matcher.group(1);
                switch (command) {
                    case "ADD":
                        String extractedEmail = matcher.group(2);
                        if (Objects.nonNull(extractedEmail)) {
                            boolean isSucsesfulAdd = emailList.add(extractedEmail);
                            if (isSucsesfulAdd) {
                                System.out.println("Электронная почта успешна добавлена!");
                            }
                        } else {
                            System.out.println(WRONG_EMAIL_ANSWER);
                        }
                        break;
                    case "LIST":
                        List<String> sortedEmails = emailList.getSortedEmails();
                        for (String email : sortedEmails) {
                            System.out.println(email);
                        }
                        break;

                }

            } else {
                System.out.println("Команда введена неверно!");
            }

            //TODO: write code here

        }
    }
}