public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(5,2);
        arithmeticCalculator.calculate();
        System.out.println(Operation.ADD);
        System.out.println(Operation.MULTIPLY);
        System.out.println(Operation.SUBTRACT);

    }
}
