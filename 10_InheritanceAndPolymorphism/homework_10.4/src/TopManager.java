public class TopManager extends Staff {
    protected final int FIX_SALARY = 58000;

    public TopManager(Company company) {
        super(company);
    }


    @Override
    public int getSalary() {
        return FIX_SALARY + getBonus();
    }

    @Override
    public int getBonus() {
        return Company.getIncome() > 10_000_000 ? (int) (FIX_SALARY * 1.5) : 0;
    }
}
