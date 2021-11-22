public class Manager implements Employee {
    private final int earningsForManager;

    public Manager(int earningsForManager) {
        this.earningsForManager = (int) (Math.random() * 25000) + 115000;
    }

    @Override
    public int getMonthSalary() {
        return 0;
    }
}
