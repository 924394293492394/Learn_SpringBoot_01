package com.example.SIMPLE_REST_API.controller;


import com.example.SIMPLE_REST_API.entity.Student;
import com.example.SIMPLE_REST_API.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/test/student")
public class StudentController {

    private StudentService  studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping
    public List<Student> getStudent(){
        return studentService.getStudent();
    }
}
