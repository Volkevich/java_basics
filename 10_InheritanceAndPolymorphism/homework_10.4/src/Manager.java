public class Manager extends Staff {

    protected final int FIX_SALARY = 58000;
    private final int salaryManager = FIX_SALARY + getBonus();

    public Manager(Company company) {
        super(company);
    }

    public int getSalary() {
        return salaryManager;
    }

    @Override
    public int getBonus() {
        return (int) (Math.random() * (145000 - 115000)) + 115000;
    }
}
