public class Manager extends Staff {

    protected static int FIX_SALARY = 58000;
    protected static int SALARY_MANAGER = FIX_SALARY + getBONUS_MANAGER();


    public static int getBONUS_MANAGER() {
        return BONUS_MANAGER;
    }
    public static int getFIX_SALARY(){
        return SALARY_MANAGER;
    }

    public int getMonthSalary() {
        return SALARY_MANAGER;
    }
}
