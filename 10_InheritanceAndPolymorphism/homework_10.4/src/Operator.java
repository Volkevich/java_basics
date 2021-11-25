public class Operator extends Staff {
    protected static int FIX_SALARY = 58000;


    @Override
    public int getMonthSalary() {
        return FIX_SALARY;
    }

    @Override
    public int getBONUS() {
        return 0;
    }

}
