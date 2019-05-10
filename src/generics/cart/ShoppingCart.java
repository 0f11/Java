package generics.cart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart<T> {

    private List<T> elements = new ArrayList<>();

    public void add(T item) {
        elements.add(item);
    }

    public void removeById(String id) {
        for (int i = 0; i < elements.size(); i++) {
            T item = elements.get(i);
            if (item.equals(id)) {
                elements.remove(i);
                break;
            }

        }
    }

    private boolean containsId(String id) {
        throw new RuntimeException("not implemented yet");
    }

    public Double getTotal() {
        double total = 0;
        for (int i = 0; i < elements.size(); i++) {
        T item = elements.get(i);

        }return null;
    }

    public void increaseQuantity(String id) {
        throw new RuntimeException("not implemented yet");
    }

    public void applyDiscountPercentage(Double discount) {
    }

    public void cancelDiscounts() {
        throw new RuntimeException("not implemented yet");
    }

    public void addAll(List items) {
        throw new RuntimeException("not implemented yet");
    }
}
