package generics.cart;

public interface CartItem {

    public String getId();

    public Double getPrice();

    public Double getFullPrice();

    public void setFullPrice(Double fullPrice);

    public void setPrice(Double price);
}
