public class Manager extends Staff {

    protected static int FIX_SALARY = 58000;


    public int getSalary() {
        return FIX_SALARY + getBONUS();
    }

    @Override
    public int getBONUS() {
        return (int) (Math.random() * (145000 - 115000)) + 115000;
    }
}
