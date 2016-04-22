package org.tguduru.spring.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.tguduru.spring.jpa.entity.Product;
import org.tguduru.spring.jpa.repository.JdbcTemplateConfig;
import org.tguduru.spring.jpa.repository.ProductRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.List;

/**
 * @author Guduru, Thirupathi Reddy
 * @modified 3/15/16
 */
public class Main {
    @Autowired
    private ProductRepository productRepository;

    private final JdbcTemplate jdbcTemplate;

    @PersistenceContext
    private EntityManager entityManager;

    public Main() {
        jdbcTemplate = new JdbcTemplateConfig().jdbcTempate();
    }

    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }
}
