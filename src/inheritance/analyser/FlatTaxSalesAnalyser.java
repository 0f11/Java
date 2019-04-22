package inheritance.analyser;

public class FlatTaxSalesAnalyser extends AbsAnalyzer {

    private static final double FLAT_TAX_RATE = 0.2;

    public FlatTaxSalesAnalyser(SalesRecord[] records) {
        super(records);
    }
    @Override
    public double returnTax(boolean isReduced) {
        return FLAT_TAX_RATE;
    }
}
