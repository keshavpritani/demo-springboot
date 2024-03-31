package com.keshav.demo.rest;

import com.keshav.demo.dao.StudentDAO;
import com.keshav.demo.entity.Student;
import com.keshav.demo.entity.StudentNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    StudentDAO studentDAO;

    public StudentRestController(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @GetMapping("/students")
    private List<Student> getStudents() {
        return this.studentDAO.findAll();
    }

    @GetMapping("/students/{studentId}")
    private Student getStudents(@PathVariable int studentId) {
        Student student = this.studentDAO.findById(studentId);

        if (student == null)
            throw new StudentNotFoundException("Student not found, id = " + studentId);

        return student;
    }

    @PostMapping("/createStudent")
    private String createStudent() {
        this.studentDAO.save(new Student("Keshav", "Pritani11", "keshav@kristal.ai"));
        return "Success";
    }
}
