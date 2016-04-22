package org.tguduru.spring.jpa;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.tguduru.spring.jpa.config.Config;
import org.tguduru.spring.jpa.entity.Product;
import org.tguduru.spring.jpa.repository.ProductRepository;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testSpringIOC() {
        final ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        final ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);
        final List<Product> products = (List<Product>) productRepository.findAll();
        System.out.println("******    Results *********");
        products.forEach(System.out::println);

        System.out.println("----------------------------");

        Product product = new Product("MacBookPro");
        productRepository.save(product);
        System.out.println("Inserted");
    }
}
