package InterviewRelatedStuff.BizoticProblemStatements;

import java.util.ArrayList;
import java.util.List;

// Enum representing item categories
enum ItemCategory {
    ELECTRONICS,
    CLOTHING,
    BOOKS,
    HOME_AND_KITCHEN
}

// Class representing an item
class Item {
    private String name;
    private String description;
    private double price;
    private int quantity;
    private ItemCategory category;

    public Item(String name, String description, double price, int quantity, ItemCategory category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public double getItemTotalCost() {
        return price * quantity;
    }

    public ItemCategory getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Description: " + description + ", Price: $" + price + ", Quantity: " + quantity;
    }
}

// Class representing the shopping cart
class ShoppingCart {
    private List<Item> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayCartContents() {
        if (items.isEmpty()) {
            System.out.println("Your shopping cart is empty.");
        } else {
            double totalCost = 0;
            for (Item item : items) {
                System.out.println(item.toString());
                totalCost += item.getItemTotalCost();
            }
            System.out.println("Total Cost: $" + totalCost);
        }
    }

    public double calculateTotalCostWithDiscountAndTax() {
        double totalCost = 0;
        double electronicsTotalCost = 0;
        double clothingTotalCost = 0;

        for (Item item : items) {
            totalCost += item.getItemTotalCost();

            if (item.getCategory() == ItemCategory.ELECTRONICS) {
                electronicsTotalCost += item.getItemTotalCost();
            } else if (item.getCategory() == ItemCategory.CLOTHING) {
                clothingTotalCost += item.getItemTotalCost();
            }
        }

        // Apply discounts for electronics and clothing
        if (electronicsTotalCost > 100) {
            totalCost -= electronicsTotalCost * 0.1;
        }
        if (clothingTotalCost > 50) {
            totalCost -= clothingTotalCost * 0.05;
        }

        // Apply sales tax
        totalCost += totalCost * 0.08;

        return totalCost;
    }
}

// Main class to test the Online Shopping Cart system
public class OnlineShoppingCartSystem {
    public static void main(String[] args) {
        Item item1 = new Item("Laptop", "High-performance laptop", 800, 1, ItemCategory.ELECTRONICS);
        Item item2 = new Item("T-Shirt", "Cotton T-Shirt", 20, 3, ItemCategory.CLOTHING);
        Item item3 = new Item("Book", "Bestseller Book", 15, 2, ItemCategory.BOOKS);

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);

        cart.displayCartContents();

        double totalAmount = cart.calculateTotalCostWithDiscountAndTax();
        System.out.println("Total Amount to be Paid: $" + totalAmount);
    }
}
