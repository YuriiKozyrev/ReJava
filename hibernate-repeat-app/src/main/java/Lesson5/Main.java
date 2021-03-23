package Lesson5;

import Lesson5.Dao.StudentDaoImpl;

public class Main {
    public static void main(String[] args) {
        PrepareDataApp.forcePrepareData();
        StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
        Student student = new Student("Bill", 5);

        //insert
        studentDaoImpl.insert(student);

        //get by Id
        System.out.println(studentDaoImpl.getById(2L));

        //update "Mark" column
        studentDaoImpl.update(student, 100);

        //delete
        studentDaoImpl.delete(student);

        //get all
        System.out.println(studentDaoImpl.getAll());


    }

}
