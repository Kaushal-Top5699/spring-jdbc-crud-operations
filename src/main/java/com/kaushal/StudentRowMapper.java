package com.kaushal;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setName(rs.getString("name"));
        student.setRollNo(rs.getString("rollNo"));
        student.setMarks(rs.getString("marks"));
        return student;
    }
}
