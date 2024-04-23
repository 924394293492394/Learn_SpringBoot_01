package com.example.SIMPLE_REST_API;

import com.example.SIMPLE_REST_API.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@SpringBootApplication
public class DemoRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRestApplication.class, args);
	}

	@GetMapping
	public List<Student> hello(){
		return List.of(
				new Student(1L, "Egor", "koroleff2014@gmail.com", LocalDate.of(2004, Month.NOVEMBER, 24), 20)
		);
	}
}
