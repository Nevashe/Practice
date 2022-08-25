package homework5.Dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import homework5.entities.Student;


public class MySessionFactory {

    private static final SessionFactory sessionFactory =
            new Configuration()
            .addAnnotatedClass(Student.class)
            .configure("hibernate.cfg.xml")
            .buildSessionFactory();
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

}
