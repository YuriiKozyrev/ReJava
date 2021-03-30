package com.example.lesson7.repositories;

import com.example.lesson7.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository extends JpaRepository<Student, Long>, JpaSpecificationExecutor<Student> {
}
