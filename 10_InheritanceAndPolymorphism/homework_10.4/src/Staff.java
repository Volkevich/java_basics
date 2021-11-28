public abstract class Staff implements Employee {
    protected static final int FIX_SALARY = 30000;
    protected int bonus = 5000;

    @Override
    public int getSalary() {
        return getFixSalary() + getBONUS();
    }

    protected abstract int getBONUS();


    protected int getFixSalary() {
        return FIX_SALARY;
    }


}
