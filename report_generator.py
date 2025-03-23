# scripts/report_generator.py

from collections import Counter

# Simulated cart data (mocked instead of pulling from backend)
cart = [
    "Apple", "Apple", "Banana", "Melon", "Melon", "Melon",
    "Lime", "Lime", "Lime", "Lime"
]

def calculate_total(cart_items):
    item_counts = Counter(item.lower() for item in cart_items)
    total = 0

    for item, count in item_counts.items():
        if item == "apple":
            total += count * 35
        elif item == "banana":
            total += count * 20
        elif item == "melon":
            total += ((count // 2) + (count % 2)) * 50
        elif item == "lime":
            total += ((count // 3) * 2 + count % 3) * 15

    return total / 100  # Convert to pounds

def generate_report(cart_items):
    print("🛒 Shopping Cart Report\n")
    item_counts = Counter(cart_items)

    for item, count in item_counts.items():
        print(f"- {item}: {count}")

    total = calculate_total(cart_items)
    print(f"\n💰 Total Price: £{total:.2f}")

# Run the report
generate_report(cart)
