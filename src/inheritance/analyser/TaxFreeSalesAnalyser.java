package inheritance.analyser;

public class TaxFreeSalesAnalyser extends AbsAnalyzer {
    private static final double NO_TAX = 0.0;

    public TaxFreeSalesAnalyser(SalesRecord[] records) {
        super(records);
    }
    @Override
    public double returnTax(boolean isReduced) {
        return NO_TAX;
    }
}
