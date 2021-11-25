public class TopManager extends Staff {
    protected static int FIX_SALARY = 58000;

    public int getBONUS_TOP_MANAGER() {
        return BONUS_TOP_MANAGER;
    }

    @Override
    public int getMonthSalary() {
        return getSALARY_TOP_MANAGER();
    }
}
