public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator calculator = new ArithmeticCalculator(2,8);
        calculator.calculate(Operation.ADD);
        calculator.calculate(Operation.SUBTRACT);
        calculator.calculate(Operation.MULTIPLY);
        System.out.println(calculator.calculate(Operation.ADD));
        System.out.println(calculator.calculate(Operation.SUBTRACT));
        System.out.println(calculator.calculate(Operation.MULTIPLY));

    }
}
