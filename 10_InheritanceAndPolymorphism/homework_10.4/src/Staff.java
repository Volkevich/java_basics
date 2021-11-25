public abstract class Staff implements Employee {
    protected int FIX_SALARY = 58000;
    protected static int  BONUS_MANAGER = (int) (Math.random() * (145000 - 115000)) + 115000;
    protected int BONUS_TOP_MANAGER = Company.getIncome() > 10000000 ? (int) (FIX_SALARY * 1.5) : 0;


    public static int getBONUS_MANAGER() {
        return BONUS_MANAGER;
    }

    public int getBONUS_TOP_MANAGER() {
        return BONUS_TOP_MANAGER;
    }

    public int getSALARY_MANAGER() {
        return FIX_SALARY + getBONUS_MANAGER();
    }

    public int getSALARY_TOP_MANAGER() {
        return FIX_SALARY + getBONUS_TOP_MANAGER();
    }
    public int getSALARY_OPERATOR() {
        return FIX_SALARY;
    }

}


