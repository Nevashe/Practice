package homework5;

import homework5.entities.Student;

import java.util.ArrayList;
import java.util.List;

import static homework5.Dao.StudentDAO.*;


public class MainTask {
    /*
        * 1. Создать базу данных Student с полями id, name, mark.
        * 2. Создать сущность Student и добавить в нее аннотации. Поле id должно заполняться автоматически.
        * 3. Создать конфигурационный файл hibernate.cfg.xml, в котором указать свойства
               для подключения к БД и список классов с аннотациями Entity.
        * 4. Создать класс со статическим методом, который возвращает объект SessionFactory.
        * 5. Создать DAO-слой с операциями добавления, удаления, изменения сущности, выборки записи по ID и всех записей.
        * 6. Добавить 1000 записей в таблицу Student.
        * 7. Проверить работоспособность приложения, выполнить методы по удалению,
               изменению, добавлению записей, а также выборки одной и всех записей.
     */

    public static void main(String[] args) {
//
//        addStudent("Alex", (byte) 4);
//        System.out.println(getStudentById((long)1));
//        removeStudent((long)3);
//        updateStudent(new Student((long) 1, "James", (byte)5));
//        System.out.println(getStudentById((long)1));
//
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("James", (byte)3));
//        students.add(new Student("Bob", (byte)2));
//        for (int i = 0; i < 1000; i++) {
//            students.add(new Student("Student #" + i, (byte) (Math.random() * 5 + 1)));
//        }
//        addStudents(students);
        System.out.println(getAllStudents());

    }
}
