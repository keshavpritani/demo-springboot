package com.keshav.demo.dao;

import com.keshav.demo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(int id);

    List<Student> findAll();

    List<Student> findByColumn(String columnName, String findValue);

    void update(Student theStudent);

    void deleteStudent(Student student);

    int deleteAllStudents();
}
