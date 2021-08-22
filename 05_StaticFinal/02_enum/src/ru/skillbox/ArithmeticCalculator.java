public class ArithmeticCalculator {


    public int a = 0;
    public int b = 0;

    public ArithmeticCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void calculate(){
    Operation.ADD = a + b;
    Operation.SUBTRACT = a / b;
    Operation.MULTIPLY = a * b;
    }


}
