import java.util.*;

public class CoolNumbers {

    public static List<String> generateCoolNumbers() {
        ArrayList<String> coolNumbersList = new ArrayList<>();

        String coolNumber = "";//XNNNYZR — пример: A111BC197, У777HC66.

        ArrayList<String> oneLetters = new ArrayList<>();// ОДНА БУКВА
        oneLetters.add("А");
        oneLetters.add("В");
        oneLetters.add("Е");
        oneLetters.add("К");
        oneLetters.add("М");
        oneLetters.add("Н");
        oneLetters.add("О");
        oneLetters.add("Р");
        oneLetters.add("С");
        oneLetters.add("Т");
        oneLetters.add("У");
        oneLetters.add("Х");
        ArrayList<String> twoLetters = new ArrayList<>();//ДВЕ БУКВЫ
        for (String two : oneLetters) {
            for (String one : oneLetters) {
                twoLetters.add(two + one);
            }
        }
        ArrayList<String> oneNumbers = new ArrayList<>();//ТРИ ЦИФРЫ
        for (int i = 1; i < 999; i++) {
            if (i < 10) {
                oneNumbers.add("00" + i);
            } else if (i < 100) {
                oneNumbers.add("0" + i);
            } else {
                oneNumbers.add(String.valueOf(i));
            }
        }
        ArrayList<String> regionNumber = new ArrayList<>();
        for (int r = 1; r < 199; r++) {
            regionNumber.add(String.valueOf(r));
        }

        for (String oneLet : oneLetters) {
            for (String twoLet : twoLetters) {
                for (String treNumb : oneNumbers) {
                    for (String regNum : regionNumber) {
                        coolNumber = oneLet + treNumb + twoLet + regNum;
                        int[] cool = {1,2,3,4,5,6, 7,8, 9};
                        for (int coolNumb : cool) {
                            if (coolNumber.split(String.valueOf(coolNumb)).length - 1 == 3) {
                                coolNumbersList.add(coolNumber);
                                break;
                            }
                        }
                        if (coolNumbersList.size() >= 2000001)
                            break;
                    }
                    if (coolNumbersList.size() >= 2000001)
                        break;
                }
                if (coolNumbersList.size() >= 2000001)
                    break;
            }
            if (coolNumbersList.size() >= 2000001)
                break;
        }

        return coolNumbersList;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        for (String brut : list)
            if (brut.contains(number)) {
                return true;
            }
        return false;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        if (Collections.binarySearch(sortedList,number) >=0 ){
            return true;
        }

        return false;
    }


    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
            if (hashSet.contains(number)) {
                return true;
            }
        return false;
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        for (String tree : treeSet)
            if (tree.contains(number)) {
                return true;
            }
        return false;
    }

}