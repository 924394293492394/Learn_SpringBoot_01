package com.example.SIMPLE_REST_API.repository;

import com.example.SIMPLE_REST_API.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
