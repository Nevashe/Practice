package homework5.Dao;


import org.hibernate.Session;
import homework5.entities.Student;

import java.util.List;

public class StudentDAO {
    public static void main(String[] args) {

    }

    public static void addStudent(String name, byte mark){

        Session session = MySessionFactory.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(new Student(name, mark));
        session.getTransaction().commit();
        session.close();
    }
    public static Student getStudentById(Long id){
        Session session = MySessionFactory.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Student student = session.get(Student.class, id);
        session.getTransaction().commit();
        session.close();
        return student;
    }

    public static void removeStudent(Long id){
        Session session = MySessionFactory.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Student s = session.get(Student.class, id);
        if(s!=null){
            session.delete(s);
        }
        session.getTransaction().commit();
        session.close();
    }

    public static void updateStudent(Student student){
        Session session = MySessionFactory.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Student studentFromDb = session.get(Student.class, student.getId());
        if(studentFromDb!=null){
            studentFromDb.setName(student.getName());
            studentFromDb.setMark(student.getMark());
            session.update(studentFromDb);
        }
        session.getTransaction().commit();
        session.close();
    }

    public static List<Student> getAllStudents(){
        Session session = MySessionFactory.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Student> students= session.createQuery("from Student as s order by s.id ", Student.class).list();
        session.getTransaction().commit();
        session.close();
        return students;
    }

    public static void addStudents(List<Student> students){
        Session session = MySessionFactory.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        students.forEach(student -> session.save(new Student(student.getName(), student.getMark())));
        session.getTransaction().commit();
        session.close();
    }
}
