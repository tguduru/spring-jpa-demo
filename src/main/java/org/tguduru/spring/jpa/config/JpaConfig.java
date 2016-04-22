package org.tguduru.spring.jpa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;

import java.util.Collections;

/**
 * @author Guduru, Thirupathi Reddy
 * @modified 3/15/16
 */
@Configuration
public class JpaConfig {
    @Autowired
    private DataSource dataSource;

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {

        final HibernateJpaVendorAdapter hibernateJpa = new HibernateJpaVendorAdapter();
        hibernateJpa.setDatabasePlatform("org.hibernate.dialect.Oracle10gDialect");
        hibernateJpa.setShowSql(false);

        final LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
        emf.setDataSource(dataSource);
        emf.setPackagesToScan("org.tguduru.spring.jpa");
        emf.setJpaVendorAdapter(hibernateJpa);
        emf.setJpaPropertyMap(Collections.singletonMap("javax.persistence.validation.mode", "none"));
        return emf;
    }

    @Bean
    public JpaTransactionManager transactionManager() {
        final JpaTransactionManager txnMgr = new JpaTransactionManager();
        txnMgr.setEntityManagerFactory(entityManagerFactory().getObject());
        return txnMgr;
    }
}
