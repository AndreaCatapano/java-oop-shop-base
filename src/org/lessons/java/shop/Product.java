package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {
    private int serialCode;
    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal tax;

    public Product(String name, String description, BigDecimal price) {
        this.serialCode = (int) (Math.random() * 900000) + 100000;
        this.name = name;
        this.description = description;
        this.price = price;
        this.tax = new BigDecimal("0.22");
    }

    public Product(String name, BigDecimal price, BigDecimal tax) {
        this.serialCode = (int) (Math.random() * 900000) + 100000;
        this.name = name;
        this.description = name;
        this.price = price;
        this.tax = tax;
    }

    // GETTER AND SETTER

    public int getSerialCode() {
        return this.serialCode;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTax() {
        return this.tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    // UTILITY

    public BigDecimal getFullPrice() {
        if (price != null && tax != null) {
            return price.add(price.multiply(tax).setScale(2, RoundingMode.DOWN));
        }
        return null;
    }

    public String getFullName() {
        if (name != null) {
            return serialCode + "-" + name;
        }
        return null;
    }
}
