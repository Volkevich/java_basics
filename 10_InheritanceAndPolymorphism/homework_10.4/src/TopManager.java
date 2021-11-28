public class TopManager extends Staff {
    protected static int FIX_SALARY = 58000;



    @Override
    public int getSalary() {
        return FIX_SALARY + getBONUS();
    }

    @Override
    public int getBONUS() {
        return Company.getIncome() > 10_000_000 ? (int) (FIX_SALARY * 1.5) : 0;
    }
}
