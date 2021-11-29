public class TopManager extends Staff {

    protected static final int FIX_SALARY = 100_000;

    public TopManager(Company company) {
        super(company);
    }

    @Override
    public int getSalary() {
        return FIX_SALARY + getBonus();
    }

    @Override
    public int getBonus() {
        return company.getIncome() > 10_000_000 ? (int) (company.getIncome() * company.getTopManagerPercent()) : 0;
    }
}
