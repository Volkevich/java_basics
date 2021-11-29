public abstract class Staff implements Employee {

    protected static final int FIX_SALARY = 30_000;

    protected Company company;

    protected Staff(Company company) {
        this.company = company;
    }

    @Override
    public int getSalary() {
        return getFixSalary() + getBonus();
    }

    protected int getFixSalary() {
        return FIX_SALARY;
    }

    protected abstract int getBonus();

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
