public abstract class Staff implements Employee {
    protected static final int FIX_SALARY = 30000;
    protected int bonus = 5000;

    public Staff(Company company) {
        this.company = company;
    }

    protected Company company;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public int getSalary() {
        return getFixSalary() + getBonus();
    }

    protected abstract int getBonus();


    protected int getFixSalary() {
        return FIX_SALARY;
    }


}
