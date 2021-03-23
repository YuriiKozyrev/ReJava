package Lesson5.Dao;

import Lesson5.Student;

import java.util.List;

public interface StudentDao {
    void insert (Student student);
    void update (Student student, int mark);
    void delete (Student student);
    Student getById(Long id);
    List<Student> getAll();
}
