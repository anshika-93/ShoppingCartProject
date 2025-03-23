package com.deltacapita.shoppingcart.service;
import com.deltacapita.shoppingcart.model.PricingRules;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {
    private final List<String> cart = new ArrayList<>();

    public void addItem(String item) {
        cart.add(item);
    }

    public List<String> getCart() {
        return new ArrayList<>(cart);
    }

    public double getTotal() {
        int totalInPence = PricingRules.calculateTotal(cart);
        return totalInPence / 100.0;
    }
}
