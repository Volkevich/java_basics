import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей ";
    System.out.println(calculateSalarySum(text));
  }

  public static int calculateSalarySum(String text) {

    String[] salary = text.split("[^0-9]+");
    int countSum = 0;


    for (int i = 1; i < salary.length; i++) {
    countSum += Integer.parseInt(salary[i]);

    }

    return countSum;
    }


  }
