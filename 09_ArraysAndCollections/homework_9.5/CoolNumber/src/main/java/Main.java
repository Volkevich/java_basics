import java.util.*;

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
        Random random = new Random();
        String number = "";

            int a = random.nextInt(2000000);
            int b = random.nextInt(2000000);
            int c = random.nextInt(2000000);
            int[] randomNumber = new int[]{a, b, c};
            for (int string : randomNumber) {
                number = CoolNumbers.generateCoolNumbers().get(string);


            System.out.println("Поиск номера: " + number);
            //поиск перебором start
            long timeStart = System.nanoTime();
            CoolNumbers.bruteForceSearchInList(result, number);
            long timeEnd = System.nanoTime();
            long time = timeEnd - timeStart;
            if (CoolNumbers.bruteForceSearchInList(result, number)) {
                yesOrNo = " номер найден, ";
            } else {
                yesOrNo = " номер не найден, ";
            }
            System.out.println("Поиск перебором: " + yesOrNo + "поиск занял - " + time + " нс");
            //ПОИСК ПЕРЕБОРОМ end

            //БИНАРНЫЙ ПОИСК start
            List<String> binarSearsh = CoolNumbers.generateCoolNumbers();
            Collections.sort(binarSearsh);
            long timeStart2 = System.nanoTime();
            CoolNumbers.binarySearchInList(binarSearsh, number);
            long timeEnd2 = System.nanoTime();
            long time2 = timeEnd2 - timeStart2;
            if (CoolNumbers.binarySearchInList(binarSearsh, number)) {
                yesOrNo = " номер найден, ";
            } else {
                yesOrNo = " номер не найден, ";
            }
            System.out.println("Бинарный поиск: " + yesOrNo + "поиск занял - " + time2 + " нс");
            //БИНАРНЫЙ ПОИСК end

            //ПОИСК HASHSET start
            HashSet<String> hashSet = new HashSet<>(result);
            long timeStart3 = System.nanoTime();
            CoolNumbers.searchInHashSet(hashSet, number);
            long timeEnd3 = System.nanoTime();
            long time3 = timeEnd3 - timeStart3;
            if (CoolNumbers.searchInHashSet(hashSet, number)) {
                yesOrNo = " номер найден, ";
            } else {
                yesOrNo = " номер не найден, ";
            }
            System.out.println("Поиск в HashSet: " + yesOrNo + "поиск занял - " + time3 + " нс");
            //ПОИСК В HASHSET end

            //ПОИСК В TREESET start
            TreeSet<String> treeSet = new TreeSet<>(result);
            long timeStart4 = System.nanoTime();
            CoolNumbers.searchInTreeSet(treeSet, number);
            long timeEnd4 = System.nanoTime();
            long time4 = timeEnd4 - timeStart4;
            if (CoolNumbers.searchInTreeSet(treeSet, number)) {
                yesOrNo = " номер найден, ";
            } else {
                yesOrNo = " номер не найден, ";
            }
            System.out.println("Поиск в TreeSet: " + yesOrNo + "поиск занял - " + time4 + " нс");

        }
    }
}