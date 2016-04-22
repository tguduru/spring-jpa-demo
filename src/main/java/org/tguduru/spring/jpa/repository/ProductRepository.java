package org.tguduru.spring.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.tguduru.spring.jpa.entity.Product;

/**
 * @author Guduru, Thirupathi Reddy
 * @modified 3/15/16
 */
public interface ProductRepository extends CrudRepository<Product, Long> {

}
