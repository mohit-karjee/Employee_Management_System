package net.mohitkarjee.springboot.repository;

import net.mohitkarjee.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    //all crud database method


}
