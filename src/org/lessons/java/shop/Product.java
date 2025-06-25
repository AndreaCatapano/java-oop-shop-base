package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {
    int serialCode;
    String name;
    String description;
    BigDecimal price;
    BigDecimal tax;

    Product(String name, String description, BigDecimal price) {
        this.serialCode = (int) (Math.random() * 900000) + 100000;
        this.name = name;
        this.description = description;
        this.price = price;
        this.tax = new BigDecimal("0.22");
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public BigDecimal getFullPrice() {
        if (price != null) {
            return price.add(price.multiply(tax).setScale(2, RoundingMode.DOWN));
        }
        return null;
    }

    public String showFullName() {
        if (name != null) {
            return serialCode + "-" + name;
        }
        return null;
    }
}
