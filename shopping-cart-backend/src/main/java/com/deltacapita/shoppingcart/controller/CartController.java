package com.deltacapita.shoppingcart.controller;

import java.util.List;

import com.deltacapita.shoppingcart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;


@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/item")
    public String addItem(@RequestBody Map<String, String> body) {
        String item = body.get("item");
        if (item == null || item.trim().isEmpty()) {
            return "Item name is required.";
        }
        cartService.addItem(item);
        return item + " added to cart.";
    }

    @GetMapping
    public List<String> getCart() {
        return cartService.getCart();
    }

    @GetMapping("/total")
    public Map<String, Double> getTotal() {
        return Map.of("total", cartService.getTotal());
    }
}
