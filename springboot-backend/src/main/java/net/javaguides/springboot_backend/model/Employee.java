package net.javaguides.springboot_backend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private  Long id;
    private String firstname;
    private String lastname;
    private String emailid;
}
