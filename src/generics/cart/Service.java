package generics.cart;

public class Service implements CartItem {
    private String serviceId;
    private Double salePrice;
    private Double fullPrice;

    public Service(String id, Double price) {
        this.serviceId = id;
        this.salePrice = price;
    }
    @Override
    public void setFullPrice(Double fullPrice) {
        this.fullPrice = fullPrice;
    }
    @Override
    public String getId() {
        return serviceId;
    }
    @Override
    public void setPrice(Double price) {
        this.salePrice = price;
    }
    @Override
    public Double getPrice() {
        return salePrice;
    }
    @Override
    public Double getFullPrice() {
        return fullPrice;
    }

}
