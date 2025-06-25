package org.lessons.java.shop;

public class Product {
    int serialCode;
    String name;
    String description;
    float price;
    float tax;

    Product(int serialCode, String name, String description, float price) {
        this.serialCode = serialCode;
        this.name = name;
        this.description = description;
        this.price = price;
        this.tax = 22.00f;
    }
}
