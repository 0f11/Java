package generics.cart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart<T extends CartItem> {

    private Map<String, List<T>> elements = new HashMap<>();

    public void add(T item) {
        String id = item.getId();
        if (containsId(id)) {
            List<T> cart = elements.get(id);
            cart.add(item);
            elements.put(id, cart);
        } else {
            List<T> items = new ArrayList<>();
            items.add(item);
            elements.put(id, items);
        }

    }

    public void removeById(String id) {
        if (containsId(id)) {
            elements.remove(id);
        }
    }

    private boolean containsId(String id) {
        return elements.containsKey(id);
    }

    public Double getTotal() {
        Double total = 0.0;
        for (List<T> items : elements.values()) {
            for (T item : items) {
                total += item.getPrice();
            }
        }return total;
    }

    public void increaseQuantity(String id) {
        List<T> cart = elements.get(id);
        T item = cart.get(0);
        add(item);

    }

    public void applyDiscountPercentage(Double discount) {
        for (List<T> items : elements.values()) {
            for (T item : items) {
                if (item.getFullPrice() != null) {
                    Double price = item.getPrice();
                    item.setPrice(price - (price*(discount/100)));
                }else{
                    Double price = item.getPrice();
                    item.setFullPrice(price);
                    item.setPrice(price - (price*(discount/100)));
                }
            }
        }
    }

    public void cancelDiscounts() {
        for (List<T> items : elements.values()) {
            for (T item : items) {
                item.setPrice(item.getFullPrice());
                item.setFullPrice(null);
            }
        }
    }

    public void addAll(List<T> items) {
        for (T item : items) {
            add(item);
        }
    }
}
