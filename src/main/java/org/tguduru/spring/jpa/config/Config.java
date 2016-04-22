package org.tguduru.spring.jpa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Guduru, Thirupathi Reddy
 * @modified 3/15/16
 */
@Configuration
@Import({ DataSourceConfig.class, JpaConfig.class, RepositoryConfig.class })
public interface Config {
}
