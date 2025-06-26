package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Product maglietta = new Product("t-shirt", "t-shirt gialla", new BigDecimal("100"));
        Product pantalone = new Product("pantalone", "pantalone nero", new BigDecimal("50"));
        Product pane = new Product("pane", new BigDecimal("1"), new BigDecimal("0.04"));

        System.out.println(maglietta.getPrice());
        System.out.println(pantalone.getPrice());
        System.out.println(pane.getPrice());

        System.out.println(maglietta.getFullPrice());
        System.out.println(pantalone.getFullPrice());

        System.out.println(pane.getFullName());
        System.out.println(pane.getFullPrice());

        pane.setName("Pane Integrale");
        pane.setPrice(new BigDecimal("1.5"));

        System.out.println(pane.getFullPrice());

        System.out.println(maglietta.getFullName());
        System.out.println(pantalone.getFullName());
        System.out.println(pane.getFullName());

    }
}
