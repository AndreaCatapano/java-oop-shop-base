package org.lessons.java.shop;

public class Product {
    int serialCode;
    String name;
    String description;
    float price;
    float tax;

    Product(String name, String description, float price) {
        this.serialCode = (int) (Math.random() * 900000) + 100000;
        this.name = name;
        this.description = description;
        this.price = price;
        this.tax = 0.22f;
    }

    public float showPrice() {
        return this.price;
    }

    public float showFullPrice() {
        return this.price * (1 + tax);
    }

    public String showFullName() {
        return serialCode + "-" + name;
    }
}
