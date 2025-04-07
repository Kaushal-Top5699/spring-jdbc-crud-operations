package com.kaushal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfig {

    // Spring JDBC provide us three classes and this is one of them used for configuration.
    @Bean
    public DriverManagerDataSource getDataSource() {
        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setDriverClassName("org.postgresql.Driver");
        source.setUrl("jdbc:postgresql://localhost:5432/SpringStarter");
        source.setUsername("postgres");
        source.setPassword("imKaushal@5699");
        return source;
    }

    // Below is the JdbcTemplate class for CRUD operations.
    @Bean
    public JdbcTemplate myJDBCTemplate() {
        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(getDataSource());
        System.out.println("DB Connected");
        return template;
    }

}
