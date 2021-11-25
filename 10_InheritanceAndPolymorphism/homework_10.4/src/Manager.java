public class Manager extends Staff {

    protected static final int FIX_SALARY = 58000;


    @Override
    public int getBONUS() {
        return BONUS_MANAGER;
    }

    @Override
    public int getMonthSalary() {
        return FIX_SALARY + getBONUS();
    }



}
