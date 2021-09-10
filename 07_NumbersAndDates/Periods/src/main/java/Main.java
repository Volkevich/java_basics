import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {

  public static void main(String[] args) {

    LocalDate birthday = LocalDate.of(1970,1,1);
    System.out.println(getPeriodFromBirthday(birthday));

  }
  public static String getPeriodFromBirthday(LocalDate birthday){

      LocalDate now = LocalDate.now();
      String years = "";
      years = years + ChronoUnit.YEARS.between(now,birthday);
    String day = "";
    day = day + ChronoUnit.DAYS.between(now,birthday);
    String month = "";
    month = month + ChronoUnit.MONTHS.between(now,birthday);
      String period = "";
      period = period + years + month + day;


      return period;
    }


}
