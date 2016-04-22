package org.tguduru.spring.jpa;

import org.tguduru.spring.jpa.entity.Product;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(final String[] args) {
        Main main = new Main();
        List<Product> products = main.getAllProducts();
        products.forEach(System.out::println);
    }
}
