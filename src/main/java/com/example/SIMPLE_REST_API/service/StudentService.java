package com.example.SIMPLE_REST_API.service;

import com.example.SIMPLE_REST_API.entity.Student;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudent(){
        return List.of(
                new Student(1L, "Egor", "koroleff2014@gmail.com", LocalDate.of(2004, Month.NOVEMBER, 24), 20)
        );
    }
}
