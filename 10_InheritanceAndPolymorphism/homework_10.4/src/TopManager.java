public class TopManager extends Staff {
    protected static final int FIX_SALARY = 58000;

    @Override
    public int getBONUS() {
        return BONUS_TOP_MANAGER;
    }

    @Override
    public int getMonthSalary() {
        return FIX_SALARY + getBONUS();
    }
}
