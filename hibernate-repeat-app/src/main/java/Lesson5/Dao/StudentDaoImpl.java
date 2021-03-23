package Lesson5.Dao;

import Lesson5.Dao.StudentDao;
import Lesson5.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class StudentDaoImpl implements StudentDao {

    SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .buildSessionFactory();

    Session session = null;

    @Override
    public void insert(Student student) {
        session = factory.getCurrentSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void update(Student student, int mark) {
        session = factory.getCurrentSession();
        session.beginTransaction();
        Student studentForUpdate = session.createQuery("SELECT s FROM Student s WHERE s.name = :name", Student.class)
                .setParameter("name", student.getName())
                .getSingleResult();
        studentForUpdate.setMark(mark);

        session.getTransaction().commit();
        System.out.println("This is update ops:   " + studentForUpdate);
        session.close();

    }

    @Override
    public void delete(Student student) {
        session = factory.getCurrentSession();
        session.beginTransaction();
        Student studentForDelete = session.createQuery("SELECT s FROM Student s WHERE s.name = :name", Student.class)
                .setParameter("name", student.getName())
                .getSingleResult();
        session.delete(studentForDelete);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Student getById(Long id) {
        session = factory.getCurrentSession();
        session.beginTransaction();
        Student studentFromDB = session.get(Student.class, id);
        session.close();
        return studentFromDB;
    }

    @Override
    public List<Student> getAll() {

        session = factory.getCurrentSession();
        session.beginTransaction();

        List<Student> list = session.createQuery("from Student").list();
        return list;
    }
}
