package com.productapp.model;



import java.util.Objects;

public class Product {
    private int id;
    private String name;
    private float price;

    public Product() {
    }

    public Product(int id, String name, float price) {
        if (id <= 0) throw new IllegalArgumentException("ID must be positive.");
        if (price <= 0) throw new IllegalArgumentException("Price must be positive.");
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) throw new IllegalArgumentException("ID must be positive.");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

}
