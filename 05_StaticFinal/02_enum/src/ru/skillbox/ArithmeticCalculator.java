public class ArithmeticCalculator {

    public int a = 0;
    public int b = 0;


    public ArithmeticCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public int calculate(Operation operation) {
        if (operation == Operation.ADD) {
            return a + b;
        }
        if (operation == Operation.SUBTRACT) {
            return a - b;
        }
        if (operation == Operation.MULTIPLY) {
            return a * b;
        }
        return 0;
    }
}
