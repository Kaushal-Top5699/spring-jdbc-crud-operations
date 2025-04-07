package com.kaushal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        JdbcTemplate template = context.getBean(JdbcTemplate.class);

        // INSERT OPERATION START //

//        String insert = "INSERT INTO student VALUES(1, 'Kaushal', '101', '90')";
//        int primaryKey = 4;
//        String name = "Rohit";
//        String rollNo = "104";
//        String marks = "92";
//        String insert = "INSERT INTO student VALUES(?, ?, ?, ?)";
//        int count = template.update(insert, primaryKey, name, rollNo, marks);
//        if (count > 0) {
//            System.out.println("Insertion success.");
//        } else {
//            System.out.println("Insertion fail.");
//        }

        // INSERT OPERATION END //

        // UPDATE OPERATION START //

//        String marks = "96";
//        int id = 1;
//        String updateQuery = "UPDATE student SET marks=? WHERE id=?";
//        int count = template.update(updateQuery, marks, id);
//        if (count > 0) {
//            System.out.println("Update Success.");
//        } else {
//            System.out.println("Update Fail.");
//        }

        // UPDATE OPERATION END //

        // DELETE OPERATION START //

        int id = 4;
        String deleteQuery = "DELETE FROM student WHERE id=?";
        int count = template.update(deleteQuery, id);
        if (count > 0) {
            System.out.println("Delete Success.");
        } else {
            System.out.println("Delete Fail.");
        }

        // DELETE OPERATION END //
    }
}