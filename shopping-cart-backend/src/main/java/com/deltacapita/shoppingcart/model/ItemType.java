package com.deltacapita.shoppingcart.model;

public enum ItemType {
    APPLE(35),
    BANANA(20),
    MELON(50),     // BOGO
    LIME(15);      // 3 for 2

    private final int priceInPence;

    ItemType(int priceInPence) {
        this.priceInPence = priceInPence;
    }

    public int getPrice() {
        return priceInPence;
    }

    public static ItemType fromString(String name) {
        return switch (name.toLowerCase()) {
            case "apple" -> APPLE;
            case "banana" -> BANANA;
            case "melon" -> MELON;
            case "lime" -> LIME;
            default -> throw new IllegalArgumentException("Unknown item: " + name);
        };
    }
}
