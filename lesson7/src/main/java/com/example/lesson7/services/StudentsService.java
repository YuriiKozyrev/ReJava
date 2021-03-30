package com.example.lesson7.services;

import com.example.lesson7.entities.Student;
import com.example.lesson7.exceptions.StudentNotFoundException;
import com.example.lesson7.repositories.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {
    private StudentsRepository studentsRepository;

    @Autowired
    public void setStudentsRepository(StudentsRepository studentsRepository){
        this.studentsRepository = studentsRepository;
    }

    public Student saveOrUpdate(Student student) {
        return studentsRepository.save(student);
    }

    public Student findById(Long id){
        return studentsRepository.findById(id).orElseThrow(() -> new StudentNotFoundException("Не могу найти студента"));
    }

    public List<Student> findAll(){
        return studentsRepository.findAll();
    }

    public void deleteById(Long id){
        studentsRepository.deleteById(id);
    }
}
