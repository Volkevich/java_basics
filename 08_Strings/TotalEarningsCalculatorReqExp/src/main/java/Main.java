import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей ";
        System.out.println(calculateSalarySum(text));
    }

    public static int calculateSalarySum(String text) {
        Pattern pattern = Pattern.compile("\\d+.(руб){1}");
        Matcher matcher = pattern.matcher(text);
        int countSum = 0;
        while (matcher.find())
            countSum += Integer.parseInt(matcher.group(0).substring(0, matcher.group(0).indexOf(" ")));
        return countSum;
    }


}
