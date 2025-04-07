package com.kaushal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

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

//        int id = 4;
//        String deleteQuery = "DELETE FROM student WHERE id=?";
//        int count = template.update(deleteQuery, id);
//        if (count > 0) {
//            System.out.println("Delete Success.");
//        } else {
//            System.out.println("Delete Fail.");
//        }

        // DELETE OPERATION END //

        // SELECT OPERATIONS START //
        // Select All
//        String selectQuery = "SELECT * FROM student";
//        List<Student> students = template.query(selectQuery, new StudentRowMapper());
//        for (int i = 0; i < students.size(); i++) {
//            System.out.println("Name: " + students.get(i).getName());
//            System.out.println("RollNo: " + students.get(i).getRollNo());
//            System.out.println("Marks: " + students.get(i).getMarks());
//            System.out.println();
//        }

        // SELECT OPERATIONS END //

        // SELECT OPERATIONS START //
        // Select One
        String selectQuery = "SELECT * FROM student WHERE id=?";
        int id = 1;
        Student students = template.queryForObject(selectQuery, new StudentRowMapper(), id);
        System.out.println("Name: " + students.getName());
        System.out.println("RollNo: " + students.getRollNo());
        System.out.println("Marks: " + students.getMarks());

        // SELECT OPERATIONS END //
    }
}