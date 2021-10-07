import javax.swing.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("0")) {
                break;
            }

            String regex = "([а-яА-Я[-]]+\\s?)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if(matcher.results().count() != 3){
                System.out.println("Введенная строка не является ФИО");
                break;
            }else {
                String[] fio = input.split(" ");
                matcher = pattern.matcher(input);
                if (matcher.find()){
                    System.out.println("Фамилия: " + fio[0]);
                    System.out.println("Имя: " + fio[1]);
                    System.out.println("Отчество: "+ fio[2]);

                }
                break;
            }





            //TODO:напишите ваш код тут, результат вывести в консоль.
            //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО
        }
    }


}