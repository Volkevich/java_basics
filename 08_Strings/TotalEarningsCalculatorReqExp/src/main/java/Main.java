

public class Main {

  public static void main(String[] args) {
    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей ";
    System.out.println(calculateSalarySum(text));
  }

  public static int calculateSalarySum(String text) {
    String[] salary = text.split("[^0-9]+");

    for (int i = 1; i < salary.length; i++) {

    }

      int salary1 = Integer.parseInt(salary[1]);
      int salary2 = Integer.parseInt(salary[2]);
      int salary3 = Integer.parseInt(salary[3]);
      Integer countSalary = salary1 + salary2 + salary3;

      return countSalary;
    }


  }
