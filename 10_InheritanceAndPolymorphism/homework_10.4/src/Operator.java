public class Operator extends Staff {

    public Operator(Company company) {
        super(company);
    }

    @Override
    protected final int getBonus() {
        return 0;
    }
}
