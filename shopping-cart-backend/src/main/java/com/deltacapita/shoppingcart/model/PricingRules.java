package com.deltacapita.shoppingcart.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PricingRules {

    public static int calculateTotal(List<String> items) {
        Map<ItemType, Integer> itemCount = new HashMap<>();

        for (String item : items) {
            try {
                ItemType type = ItemType.fromString(item);
                itemCount.put(type, itemCount.getOrDefault(type, 0) + 1);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        int total = 0;

        for (Map.Entry<ItemType, Integer> entry : itemCount.entrySet()) {
            ItemType item = entry.getKey();
            int count = entry.getValue();

            switch (item) {
                case APPLE -> total += count * item.getPrice();
                case BANANA -> total += count * item.getPrice();
                case MELON -> total += ((count / 2) + (count % 2)) * item.getPrice();
                case LIME -> total += ((count / 3) * 2 + count % 3) * item.getPrice();
            }
        }

        return total;
    }
}
