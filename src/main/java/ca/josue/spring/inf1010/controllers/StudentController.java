package ca.josue.spring.inf1010.controllers;

import ca.josue.spring.inf1010.dto.StudentDTO;
import ca.josue.spring.inf1010.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("")
    public StudentDTO[] index() {
        return studentService.getStudents();
    }

    @GetMapping("/{id}")
    public StudentDTO get(@PathVariable(name = "id") String studentId) {
        studentId = studentId.toUpperCase();
        return studentService.getStudentById(studentId);
    }

}
