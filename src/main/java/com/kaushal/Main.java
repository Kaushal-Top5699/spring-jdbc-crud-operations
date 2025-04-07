package com.kaushal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        JdbcTemplate template = context.getBean(JdbcTemplate.class);
//        String insert = "INSERT INTO student VALUES(1, 'Kaushal', '101', '90')";
        int primaryKey = 3;
        String name = "Suraj";
        String rollNo = "103";
        String marks = "92";
        String insert = "INSERT INTO student VALUES(?, ?, ?, ?)";
        int count = template.update(insert, primaryKey, name, rollNo, marks);
        if (count > 0) {
            System.out.println("Insertion success.");
        } else {
            System.out.println("Insertion fail.");
        }
    }
}