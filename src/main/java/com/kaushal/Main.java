package com.kaushal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        JdbcTemplate template = context.getBean(JdbcTemplate.class);
        String insert = "INSERT INTO student VALUES(1, 'Kaushal', '101', '90')";
        template.update(insert);
    }
}