import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */

    public static void main(String[] args) {
        List<String> result = CoolNumbers.generateCoolNumbers();
        String yesOrNo = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер: ");
        String numb = scanner.nextLine();
        System.out.println("Поиск номера: " + numb);
        //поиск перебором start
        long timeStart = System.nanoTime();
        CoolNumbers.bruteForceSearchInList(result, numb);
        long timeEnd = System.nanoTime();
        long time = timeEnd - timeStart;
        if (CoolNumbers.bruteForceSearchInList(result, numb)) {
            yesOrNo = " номер найден, ";
        } else {
            yesOrNo = " номер не найден, ";
        }
        System.out.println("Поиск перебором: " + yesOrNo + "поиск занял - " + time / 100000 + " нс");
        //ПОИСК ПЕРЕБОРОМ end

        //БИНАРНЫЙ ПОИСК start
        long timeStart2 = System.nanoTime();
        CoolNumbers.binarySearchInList(result, numb);
        long timeEnd2 = System.nanoTime();
        long time2 = timeEnd2 - timeStart2;
        if (CoolNumbers.binarySearchInList(result, numb)) {
            yesOrNo = " номер найден, ";
        } else {
            yesOrNo = " номер не найден, ";
        }
        System.out.println("Бинарный поиск: " + yesOrNo + "поиск занял - " + time2 / 100000 + " нс");
        //БИНАРНЫЙ ПОИСК end

        //ПОИСК HASHSET start
        HashSet<String> hashSet = new HashSet<>(result);
        long timeStart3 = System.nanoTime();
        CoolNumbers.searchInHashSet(hashSet,numb);
        long timeEnd3 = System.nanoTime();
        long time3 = timeEnd3 - timeStart3;
        if (CoolNumbers.searchInHashSet(hashSet,numb)) {
            yesOrNo = " номер найден, ";
        } else {
            yesOrNo = " номер не найден, ";
        }
        System.out.println("Поиск в HashSet: " + yesOrNo + "поиск занял - " + time3 / 100000 + " нс");
        //ПОИСК В HASHSET end

        //ПОИСК В TREESET start
        TreeSet<String> treeSet = new TreeSet<>(result);
        long timeStart4 = System.nanoTime();
        CoolNumbers.searchInTreeSet(treeSet,numb);
        long timeEnd4 = System.nanoTime();
        long time4 = timeEnd4 - timeStart4;
        if (CoolNumbers.searchInTreeSet(treeSet,numb)) {
            yesOrNo = " номер найден, ";
        } else {
            yesOrNo = " номер не найден, ";
        }
        System.out.println("Поиск в TreeSet: " + yesOrNo + "поиск занял - " + time4 / 100000 + " нс");
    }
}
