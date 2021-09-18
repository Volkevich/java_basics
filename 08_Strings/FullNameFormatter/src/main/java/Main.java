import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    boolean isFio = false;
    int j = 0;
    Scanner scanner = new Scanner(System.in);
    String fio = scanner.nextLine();
    String[] fioMass = fio.split(" "); // разделяет строку на массив
    if (fioMass.length != 3) {
      System.out.println("Введенная строка не является ФИО");
    }

    while ((fioMass.length == 3) && (j < 3)) {

      for (int i = 0; i < fioMass[j].length(); i++) {
        char fioSymbol = fioMass[j].charAt(i);
        int ascii = (int) fioSymbol;
        if ((ascii > 1039 && ascii <= 1103) || (ascii == 45)) {
          isFio = true;

        } else {
          isFio = false;
          System.out.println("Введенная строка не является ФИО");
          break;
        }

      }
      if (!isFio) {
        break;
      }else {
        j+=1;
      }

      if (isFio) {
        String template = "Фамилия: %s\nИмя: %s\nОтчество: %s\n";
        System.out.printf(template,fioMass[0],fioMass[1],fioMass[2]);
        break;
      } else {
        System.out.println("Введенная строка не является ФИО");
      }
    }
  }
}
//TODO:напишите ваш код тут, результат вывести в консоль.
//При невалидном ФИО вывести в консоль: Введенная строка не является ФИО


