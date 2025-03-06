package net.javaguides.springboot_backend.Repository;

import net.javaguides.springboot_backend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repository extends JpaRepository<Employee, Long> {
}
