package generics.cart;

public class Product implements CartItem {
    private String id;
    private Double price;
    private Double fullPrice;

    public Product(String id, Double price) {
        this.id = id;
        this.price = price;
    }
    public void setFullPrice(Double fullPrice) {
        this.fullPrice = fullPrice;
    }

    @Override
    public String getId() {
        return id;
    }
    @Override
    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return price;
    }
    @Override
    public Double getFullPrice() {
        return fullPrice;
    }
}
