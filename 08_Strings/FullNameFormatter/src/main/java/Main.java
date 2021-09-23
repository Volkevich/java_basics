import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    String firstName = "";
    String iotName = "";
    String otcName = "";

    Scanner scanner = new Scanner(System.in);
    String fio = scanner.nextLine();




    while (true) {
      int spaceCount = 0;
      for (int i = 0; i < fio.length(); i++) {
        char fioSymbol = fio.charAt(i);
        if (fioSymbol == ' '){
          spaceCount++;
        }
        if (!Character.UnicodeBlock.of(fioSymbol).equals(Character.UnicodeBlock.CYRILLIC)) {
          System.out.println("Введенная строка не является ФИО");

          break;
        }
        if (Character.isDigit(fioSymbol)){
          System.out.println("Введенная строка не является ФИО");
          break;
        }

        if (spaceCount < 3){
          int end = fio.indexOf(" ");
          firstName = fio.substring(i,end);
          int end2 = fio.indexOf(" ");
          int start = fio.lastIndexOf(i);
          otcName = fio.substring(start,end2);


          String template = "Фамилия: %s\nИмя: %s\nОтчество: %s\n";
          System.out.println(firstName + otcName);
          System.out.println(otcName);

        }else {
          System.out.println("Введенная строка не является ФИО");
        }
        break;
      }
      break;
      }
    }
  }

//TODO:напишите ваш код тут, результат вывести в консоль.
//При невалидном ФИО вывести в консоль: Введенная строка не является ФИО


