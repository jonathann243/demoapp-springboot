package ca.josue.spring.inf1010.service;

import ca.josue.spring.inf1010.dto.StudentDTO;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public StudentDTO[] getStudents() {
        StudentDTO[] students = new StudentDTO[3];
        students[0] = new StudentDTO("JL","Josue", "Lubaki", "josue@gmail.com", "123456789");
        students[1] = new StudentDTO("JG","Jonathan", "Garcia", "garcia@gmail.com", "123456789");
        students[2] = new StudentDTO("IC","Ismael", "Coulibaly", "ismael@gmail.com", "123456789");
        return students;
    }

    public StudentDTO getStudentById(String id){
        StudentDTO[] students = getStudents();
        for (StudentDTO student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }
}
