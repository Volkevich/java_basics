public class Operator implements Employee {
    private static final int FIX_SAL = 36500;


    @Override
    public int getMonthSalary() {
        return FIX_SAL;
    }
}
