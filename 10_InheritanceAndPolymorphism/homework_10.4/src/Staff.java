public abstract class Staff implements Employee {
    protected static final int FIX_SALARY = 58000;
    protected static int  BONUS_MANAGER = (int) (Math.random() * (145000 - 115000)) + 115000;
    protected static int BONUS_TOP_MANAGER = Company.getIncome() > 10000000 ? (int) (FIX_SALARY * 1.5) : 0;


    public abstract  int getBONUS();


    public int getSALARY() {
        return FIX_SALARY + BONUS_MANAGER;
    }

    public int getSALARY_TOP_MANAGER() {
        return FIX_SALARY + BONUS_TOP_MANAGER;
    }

}


