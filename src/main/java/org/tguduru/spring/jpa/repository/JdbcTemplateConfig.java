package org.tguduru.spring.jpa.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @author Guduru, Thirupathi Reddy
 * @modified 3/15/16
 */
@Configuration
public class JdbcTemplateConfig {
    @Autowired
    private DataSource dataSource;

    @Bean
    public JdbcTemplate jdbcTempate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }
}
