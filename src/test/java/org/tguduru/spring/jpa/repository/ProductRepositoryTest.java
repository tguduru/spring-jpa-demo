package org.tguduru.spring.jpa.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.tguduru.spring.jpa.config.Config;
import org.tguduru.spring.jpa.entity.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Guduru, Thirupathi Reddy
 * @modified 3/15/16
 */
@ContextConfiguration(classes = { Config.class, JdbcTemplateConfig.class })
@RunWith(SpringJUnit4ClassRunner.class)
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    public void testInsert(){
        Product product = new Product("iPad");
        List<Product> products = new ArrayList<>();
        products.add(product);
        productRepository.save(product);
        System.out.println("added");
    }

    @Test
    public void testFindAll() {
        final List<Product> products = (List<Product>) productRepository.findAll();
        products.forEach(System.out::println);
    }

}