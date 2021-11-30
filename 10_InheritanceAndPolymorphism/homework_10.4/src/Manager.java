public class Manager extends Staff {

    protected static final int FIX_SALARY = 70_000;
    private final double managerIncome;

    public Manager(Company company) {
        super(company);
        this.managerIncome = (Math.random() * (145000 - 115000)) + 115000;
    }

    @Override
    public int getSalary() {
        return FIX_SALARY + getBonus();
    }

    @Override
    public int getBonus() {
        return (int) (managerIncome * company.getManagerPercent());
    }
}
