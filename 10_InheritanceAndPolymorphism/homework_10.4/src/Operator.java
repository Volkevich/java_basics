public class Operator extends Staff {

    private final int bonus = 0;

    public Operator(Company company) {
        super(company);
    }

    @Override
    protected final int getBonus() {
        return this.bonus;
    }

}
