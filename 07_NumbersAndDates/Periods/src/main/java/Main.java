import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;

public class Main {

  public static void main(String[] args) {

    LocalDate birthday = LocalDate.EPOCH;
    System.out.println(getPeriodFromBirthday(birthday));

  }
  public static String getPeriodFromBirthday(LocalDate birthday){
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    LocalDate startDate = LocalDate.parse("01.01.1970",formatter);
    LocalDate endDate = LocalDate.now();
    Period period = Period.between(startDate,endDate);
    StringBuilder text = new StringBuilder();
    text.append(period.getYears()).append(" years ").append(period.getMonths()).append(" months ").append(period.getDays()).append(" day");




      return text.toString();
    }


}
