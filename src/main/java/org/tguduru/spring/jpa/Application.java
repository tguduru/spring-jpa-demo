package org.tguduru.spring.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.tguduru.spring.jpa.entity.Product;
import org.tguduru.spring.jpa.repository.ProductRepository;

/**
 * @author Guduru, Thirupathi Reddy
 * @modified 3/15/16
 */
@SpringBootApplication
public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);
    public static void main(final String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public CommandLineRunner save(final ProductRepository repository) {

        return (args) -> {
            repository.save(new Product("iPhone"));
            log.info("---- Saved Product");
        };
    }
}
