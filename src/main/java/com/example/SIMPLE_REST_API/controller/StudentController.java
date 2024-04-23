package com.example.SIMPLE_REST_API.controller;


import com.example.SIMPLE_REST_API.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/test/student")
public class StudentController {

    @GetMapping
    public List<Student> getStudent(){
        return List.of(
                new Student(1L, "Egor", "koroleff2014@gmail.com", LocalDate.of(2004, Month.NOVEMBER, 24), 20)
        );
    }
}
