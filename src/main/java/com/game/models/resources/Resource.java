package com.game.models.resources;

public class Resource {
    private String name;
    private int quantity;

    public Resource(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int amount) {
        quantity += amount;
    }

    public void reduceQuantity(int amount) {
        quantity -= amount;
    }
}
