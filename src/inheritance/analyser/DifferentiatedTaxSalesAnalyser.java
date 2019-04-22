package inheritance.analyser;

public class DifferentiatedTaxSalesAnalyser extends AbsAnalyzer {

    private static final Double REGULAR_TAX = 0.2;
    private static final Double REDUCED_TAX = 0.1;

    public DifferentiatedTaxSalesAnalyser(SalesRecord[] records) {
        super(records);
    }

    @Override
    public double returnTax(boolean isReduced) {
        if (isReduced) {
            return REDUCED_TAX;
        }
        return REGULAR_TAX;
    }
}
