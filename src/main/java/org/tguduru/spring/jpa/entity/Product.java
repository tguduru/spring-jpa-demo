package org.tguduru.spring.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * Entity for Product table.
 * @author Guduru, Thirupathi Reddy
 * @modified 3/15/16
 */
@Entity(name = "Product")
public class Product {
    @Id
    @Column(name = "PRODUCT_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "productSeq")
    @SequenceGenerator(name = "productSeq", sequenceName = "PRODUCT_SEQ", allocationSize = 1)
    private long id;

    @Column(name = "product_name")
    private String productName;

    public Product() {
    }

    public Product(final String productName) {
        this.productName = productName;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public void setProductName(final String productName) {
        this.productName = productName;
    }

    public long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("id=").append(id);
        sb.append(", productName='").append(productName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
