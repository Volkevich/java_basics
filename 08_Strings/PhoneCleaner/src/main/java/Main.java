import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      String regex = "[^0-9]";
      String text = input.replaceAll(regex, "");

      if (text.length()==10||text.length()==11) {
        if (text.length()==10){
          text = "7"+text;
          System.out.print(text);
          break;
        }
        else if (text.length()==11){
          if(text.startsWith("7") || text.startsWith("8")){
            if(text.startsWith("8"))
              text = text.replaceFirst("8","7");
            System.out.print(text);
            return;
          }
        }
      }else {
        System.out.print("Неверный формат номера");
        return;
      }
      //TODO:напишите ваш код тут, результат вывести в консоль.
    }
  }

}
