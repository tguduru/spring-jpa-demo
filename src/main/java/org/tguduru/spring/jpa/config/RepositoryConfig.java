package org.tguduru.spring.jpa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Guduru, Thirupathi Reddy
 * @modified 3/15/16
 */
@Configuration
@EnableJpaRepositories(basePackages = "org.tguduru.spring.jpa")
public class RepositoryConfig {
}
