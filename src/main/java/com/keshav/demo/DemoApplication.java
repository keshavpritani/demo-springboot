package com.keshav.demo;

//import com.keshav.demo.dao.StudentDAO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
//        return runner -> {
//            createStudent(studentDAO);
////            readStudent(studentDAO);
////            updateStudent(studentDAO);
////            deleteStudent(studentDAO);
////            deleteAllStudents(studentDAO);
//        };
//    }

//    private void deleteAllStudents(StudentDAO studentDAO) {
//        int countDeletedStudents = studentDAO.deleteAllStudents();
//        System.out.println("countDeletedStudents = " + countDeletedStudents);
//    }
//
//    private void deleteStudent(StudentDAO studentDAO) {
//        Student student = studentDAO.findById(8);
//        System.out.println("Deleting this student = " + student);
//        studentDAO.deleteStudent(student);
//    }
//
//    private void updateStudent(StudentDAO studentDAO) {
//        Student student = studentDAO.findById(7);
//
//        student.setFirstName("Pritani");
//
//        studentDAO.update(student);
//
//        System.out.println("student = " + student);
//    }
//
//
//    private void readStudent(StudentDAO studentDAO) {
////        Student student = studentDAO.findById(5);
//
//        List<Student> students = studentDAO.findByColumn("firstName", "Pritani");
//        System.out.println(students);
//    }
//
//    private void createStudent(StudentDAO studentDAO) {
//        Student student = new Student("Keshav2", "Pritani1", "keshav@kristal.ai");
//
//        System.out.println("Saving the student = " + student);
//        studentDAO.save(student);
//
//        System.out.println("Saved the Student, ID = " + student.getId());
//    }

}
