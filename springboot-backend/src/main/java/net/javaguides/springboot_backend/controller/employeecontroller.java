package net.javaguides.springboot_backend.controller;

import net.javaguides.springboot_backend.exception.Notfoundexception;
import net.javaguides.springboot_backend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping

public class employeecontroller {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();

    }

    @PostMapping
    public  Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);


    }
    public RepositoryEntity<Employee> getEmployeeById(long id){
        Employee employee=employeeRepository.findById(id)
                .orElseThrow(()-> new Notfoundexception("Employee not exist with this id:"+id));
    }
}
