public class TopManager implements Employee {
    private static final int FIX_SAL = 70000;


    @Override
    public int getMonthSalary() {
        return FIX_SAL + Company.getIncome() > 10000000 ? (int) (FIX_SAL * 1.5) : 0;
    }
}
