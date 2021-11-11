import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */

    public static void main(String[] args) {
    CoolNumbers.generateCoolNumbers();
        Collections.sort(CoolNumbers.generateCoolNumbers());
        long start = System.currentTimeMillis();
        int index = Collections.binarySearch(CoolNumbers.generateCoolNumbers(), "A111BC197");
        System.out.println(index);
        long duration = System.currentTimeMillis() - start;
        System.out.println("Номер по бинарному поиску найден за - " + duration);

    }
}
