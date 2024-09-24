/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author WALEED TRADERS
 */
import java.util.ArrayList;
import java.util.List;

// Before Applying Information Expert
class ItemBefore {
    private String name;
    private double price;
    private int quantity;

    public ItemBefore(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters for price and quantity
    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

// ShoppingCart class handles too much responsibility before Information Expert
class ShoppingCartBefore {
    private List<ItemBefore> items;

    public ShoppingCartBefore() {
        items = new ArrayList<>();
    }

    // Add item to cart
    public void addItem(ItemBefore item) {
        items.add(item);
    }

    // ShoppingCart calculates total price (misplaced responsibility)
    public double calculateTotalPrice() {
        double total = 0;
        for (ItemBefore item : items) {
            total += item.getPrice() * item.getQuantity();  // Misplaced logic
        }
        return total;
    }
}

// After Applying Information Expert
class ItemAfter {
    private String name;
    private double price;
    private int quantity;

    public ItemAfter(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Item calculates its own total price (Information Expert principle applied)
    public double calculateTotalPrice() {
        return price * quantity;  // Moved responsibility here
    }
}

// ShoppingCart class now delegates the responsibility properly
class ShoppingCartAfter {
    private List<ItemAfter> items;

    public ShoppingCartAfter() {
        items = new ArrayList<>();
    }

    // Add item to cart
    public void addItem(ItemAfter item) {
        items.add(item);
    }

    // ShoppingCart now delegates total price calculation to Item (Information Expert)
    public double calculateTotalPrice() {
        double total = 0;
        for (ItemAfter item : items) {
            total += item.calculateTotalPrice();  // Delegated responsibility
        }
        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        // Before applying Information Expert
        System.out.println("Before Applying Information Expert:");
        ShoppingCartBefore cartBefore = new ShoppingCartBefore();
        cartBefore.addItem(new ItemBefore("Book", 10, 2));
        cartBefore.addItem(new ItemBefore("Pen", 1.5, 5));
        System.out.println("Total Price (Before): " + cartBefore.calculateTotalPrice());

        // After applying Information Expert
        System.out.println("\nAfter Applying Information Expert:");
        ShoppingCartAfter cartAfter = new ShoppingCartAfter();
        cartAfter.addItem(new ItemAfter("Book", 10, 2));
        cartAfter.addItem(new ItemAfter("Pen", 1.5, 5));
        System.out.println("Total Price (After): " + cartAfter.calculateTotalPrice());
    }
}
