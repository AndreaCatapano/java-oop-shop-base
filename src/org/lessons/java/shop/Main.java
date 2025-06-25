package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Product maglietta = new Product("t-shirt", "t-shirt gialla", 100);
        Product pantalone = new Product("pantalone", "pantalone nero", 50);
        Product maglione = new Product("maglione", "maglione rosso", 200);

        System.out.println(maglietta.showPrice());
        System.out.println(pantalone.showPrice());
        System.out.println(maglione.showPrice());

        System.out.println(maglietta.showFullPrice());
        System.out.println(pantalone.showFullPrice());
        System.out.println(maglione.showFullPrice());

        System.out.println(maglietta.showFullName());
        System.out.println(pantalone.showFullName());
        System.out.println(maglione.showFullName());

    }
}
