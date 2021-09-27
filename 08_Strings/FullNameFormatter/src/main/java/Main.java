import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    String firstName = "";
    String iotName = "";
    String otcName = "";
    int spaceCount = 0;
    int dashCount = 0;
    Scanner scanner = new Scanner(System.in);
    String fio = scanner.nextLine();
    for (int i = 0; i < fio.length(); i++) {
      char fioSymbol = fio.charAt(i);
      if (fioSymbol == ' ') {
        spaceCount++;
      }else if (fioSymbol == '-'){
        dashCount++;
      }
      else if (((!Character.UnicodeBlock.of(fioSymbol).equals(Character.UnicodeBlock.CYRILLIC)) || (Character.isDigit(fioSymbol)))){
        System.out.println("Введенная строка не является ФИО");
        return;
      }
    }

      if ((spaceCount == 2 && dashCount == 1) || (spaceCount == 2 && dashCount == 0) ) {
        firstName = fio.substring(0, fio.indexOf(" "));
        fio = fio.substring(fio.indexOf(" ") + 1);
        iotName = fio.substring(0,fio.indexOf(" "));
        fio = fio.substring(fio.indexOf(" ") + 1);
        otcName = fio;


        String template = "Фамилия: %s\nИмя: %s\nОтчество: %s\n";
        System.out.printf(template,firstName,iotName,otcName);

      }else {
        System.out.println("Введенная строка не является ФИО");
      }

    }
  }


//TODO:напишите ваш код тут, результат вывести в консоль.
//При невалидном ФИО вывести в консоль: Введенная строка не является ФИО


