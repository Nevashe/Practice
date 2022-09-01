package homework7.services;

import homework7.entities.Student;
import homework7.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }

    public Student getStudentById(Long id){
        Optional<Student> optional = studentRepository.findById(id);
        if(optional.isPresent()){
            return optional.get();
        }
        throw new NullPointerException();
    }

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public void updateStudent(Student student){
        Student oldStudent = getStudentById(student.getId());
        if(!oldStudent.getName().equals(student.getName()) &&student.getName()!=null&&!student.getName().equals("")){
            oldStudent.setName(student.getName());
        }
        if(oldStudent.getAge()!=student.getAge()&&student.getAge()!=0){
            oldStudent.setAge(student.getAge());
        }
        studentRepository.save(oldStudent);
    }

    public void deleteStudentById(Long id) {
        Student student = getStudentById(id);
        studentRepository.delete(student);
    }
}
