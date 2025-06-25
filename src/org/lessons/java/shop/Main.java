package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Product maglietta = new Product("t-shirt", "t-shirt gialla", new BigDecimal("100"));
        Product pantalone = new Product("pantalone", "pantalone nero", new BigDecimal("50"));
        Product maglione = new Product("maglione", "maglione rosso", new BigDecimal("200"));

        System.out.println(maglietta.getPrice());
        System.out.println(pantalone.getPrice());
        System.out.println(maglione.getPrice());

        System.out.println(maglietta.getFullPrice());
        System.out.println(pantalone.getFullPrice());
        System.out.println(maglione.getFullPrice());

        System.out.println(maglietta.showFullName());
        System.out.println(pantalone.showFullName());
        System.out.println(maglione.showFullName());

    }
}
