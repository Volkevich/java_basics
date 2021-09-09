import java.text.Format;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int day = 04;
        int month = 10;
        int year = 1995;

        System.out.println(collectBirthdays(year, month, day));

    }

    public static String collectBirthdays(int year, int month, int day) {
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - E").localizedBy(Locale.forLanguageTag("us"));
        int i = 0;
        String date = "";
        while (birthday.isBefore(today)) { //до
            date = date + i + " - " + birthday.format(formatter) + System.lineSeparator();
            birthday = birthday.plusYears(1);
            i++;
        }
        return date;
    }
}
        //TODO реализуйте метод для построения строки в следующем виде
        //0 - 31.12.1990 - Mon
        //1 - 31.12.1991 - Tue


