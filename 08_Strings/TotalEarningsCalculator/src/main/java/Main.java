public class Main {

  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    //TODO: напишите ваш код, результат вывести в консоль
    System.out.println(getCountmany(text));
  }

  public static String getCountmany(String text) {

    String count = "";
    int countSum = 0;
    for (int i = 0; i < text.length(); i++) {
      char symbol = text.charAt(i);
      if (Character.isDigit(symbol)){
        int end = text.indexOf(" р",i);
        count = text.substring(i,end);
        countSum += Integer.parseInt(count);
        i=end;
      }

    }
    System.out.println(countSum);

    return " ";
  }
}