package homework7.controllers;

import homework7.entities.Student;
import homework7.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.function.Function;


@Controller
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    @Autowired
    private final StudentService studentService;

    @GetMapping
    public String getStudents(Model model){
        model.addAttribute("studentsList", studentService.getStudents());
        model.addAttribute("student", new Student());  // form for addStudent
        return "students";
    }
    @PostMapping
    public String addStudent(@ModelAttribute Student student){
        if(student.getName()!=null) {
            studentService.addStudent(student);
        }
        return "redirect:/students";
    }

    @GetMapping("/remove/{id}")
    public String deleteStudent(@PathVariable(value = "id") Long id){
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }

    @PostMapping("/update/{id}")
    public String updateStudent(@ModelAttribute Student student, @PathVariable(value = "id") Long id){
        student.setId(id);
        studentService.updateStudent(student);
        return "redirect:/students";
    }

}
