package net.javaguides.springboot_backend;

import net.javaguides.springboot_backend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {

		Employee employee = new Employee();
		employee.setFirstname("Muthu");
		employee.setLastname("Kumar");
		employee.setEmailid("muthu@gmail.com");
		employeeRepository.save(employee);


		Employee employee1 = new Employee();
		employee1.setFirstname("Muthu");
		employee1.setLastname("Kishore");
		employee1.setEmailid("mutu@gmail.com");
		employeeRepository.save(employee1);
	}
}
