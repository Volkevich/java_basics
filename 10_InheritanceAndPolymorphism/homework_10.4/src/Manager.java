public class Manager implements Employee {

    private static final int FIX_SALARY = 58000;
    private final int earningsForCompany;

    public Manager() {
        this.earningsForCompany = (int) (Math.random() * (145000 - 115000)) + 115000;
    }

    public int getMonthSalary() {
        return FIX_SALARY + (int) (earningsForCompany * 0.05);
    }
}
