package ca.josue.spring.inf1010.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentDTO {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
}
