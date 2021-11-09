import java.util.*;

public class CoolNumbers {

    public static List<String> generateCoolNumbers() {
        ArrayList<String> arrayList = new ArrayList<>();
        String regex = "[АВЕКМНОРСТУХ][0-9]{3}[АВЕКМНОРСТУХ]{2}[0-9]{3}";
        String[] letters = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};

        for (int i = 0;i < letters.length;i++) {
            for (int a = 0; a < 12; a++) {
                for (int r = 1; r < 199; r++) {
                    String region = String.valueOf(r);
                    String randomLetters = letters[i];
                    int randomNumbers = (int) (Math.random() * 9);
                    if (randomNumbers == 000) {
                        randomNumbers = randomNumbers + 1;
                    }
                    if (r < 10) {
                        region = "0" + region;
                    }
                    String number = String.format("%s%d%d%d%s%s%s", randomLetters,
                            randomNumbers, randomNumbers, randomNumbers, randomLetters, randomLetters, region);
                    arrayList.add(number);
                    Collections.sort(arrayList);
                }
            }
        }
            System.out.println(String.join(";\n",arrayList) );
        return arrayList;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.sort(arrayList);
        Collections.binarySearch(arrayList,"A111BC197");
        Long start = System.nanoTime();
        System.out.println(start);

        return false;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {

        return false;
    }


    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {

        return false;
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {

        return false;
    }

}
