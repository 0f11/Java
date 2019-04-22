package inheritance.analyser;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

abstract class AbsAnalyzer {

    private SalesRecord[] records;
    private static final double DEF_TAX = 0.0;

    public AbsAnalyzer(SalesRecord[] records) {
        this.records = records;
    }

    public Double getTotalSales() {
        double total = 0.0;
        for (SalesRecord r : records) {
            total += totalSales(r);
        }return total;
    }

    public Double getTotalSalesByProductId(String id) {
        double totalById = 0.0;
        if (id != null) {
            for (SalesRecord r : this.records) {
                if (id.equals(r.getProductId())) {
                    totalById += totalSales(r);
                }
            }
        }return totalById;
    }

    public String getIdOfMostPopularItem() {
        LinkedHashMap<String, Integer> mostPopular = new LinkedHashMap<>();
        for (SalesRecord r : this.records) {
            if (mostPopular.containsKey(r.getProductId())) {
                Integer amount = mostPopular.get(r.getProductId());
                mostPopular.put(r.getProductId(), amount + r.getItemsSold());
            }else{
                mostPopular.put(r.getProductId(), r.getItemsSold());
            }
        }return maxValue(mostPopular);
    }

    public String maxValue(LinkedHashMap<String, Integer> records) {
        Integer max = Collections.max(records.values());
        for (Map.Entry<String, Integer> x : records.entrySet()) {
            if (x.getValue().equals(max)) {
                return x.getKey();
            }
        }return "";
    }

    public String getIdOfItemWithLargestTotalSales() {
        LinkedHashMap<String, Integer> mostPopular = new LinkedHashMap<>();
        for (SalesRecord r : this.records) {
            if (mostPopular.containsKey(r.getProductId())) {
                Integer amount = mostPopular.get(r.getProductId());
                mostPopular.put(r.getProductId(), amount + 1);
            }else{
                mostPopular.put(r.getProductId(), 1);
            }
        }return maxValue(mostPopular);
    }
    public double returnTax(boolean isReduced) {
        return DEF_TAX;
    }
    public double totalSales(SalesRecord record) {
        return record.getItemsSold() * (record.getProductPrice() / (1 + returnTax(record.hasReducedRate())));
    }
}
