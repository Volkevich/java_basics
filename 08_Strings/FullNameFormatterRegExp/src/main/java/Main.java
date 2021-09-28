import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
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
      String[]fio1 = fio.split(" ");

      String template = "Фамилия: %s\nИмя: %s\nОтчество: %s\n";
      System.out.printf(template,fio1[0],fio1[1],fio1[2]);

    }else {
      System.out.println("Введенная строка не является ФИО");
    }

  }
}