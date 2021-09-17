public class Main {

  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    //TODO: напишите ваш код, результат вывести в консоль
    System.out.println(getCountmany(text));
  }

  public static String getCountmany(String text){
    String Vasya = "заработал ";
    String Petya = " Петя - ";
    String Masha = " Маша - ";

    int startVasya = text.indexOf(Vasya);
    int endVasya = text.indexOf(" рублей, ",startVasya);
    int startPetya = text.indexOf(Petya);
    int endPetya = text.indexOf(" рубля, ", startPetya);
    int startMasha = text.indexOf(Masha);
    int endMasha = text.indexOf(" рублей",startMasha);
    String MashaCount = text.substring(startMasha + Masha.length(),endMasha);

    String PetyaCount = text.substring(startPetya + Petya.length(),endPetya);

    String VasyaCount = text.substring(startVasya + Vasya.length(),endVasya);

    int countMasha = Integer.parseInt(MashaCount);
    int countPetya = Integer.parseInt(PetyaCount);
    int countVasya = Integer.parseInt(VasyaCount);
    Integer countAll = countMasha + countPetya + countVasya;


    return countAll.toString();
  }


}