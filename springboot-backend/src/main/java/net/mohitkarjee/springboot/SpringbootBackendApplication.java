package net.mohitkarjee.springboot;

import net.mohitkarjee.springboot.model.Employee;
import net.mohitkarjee.springboot.repository.EmployeeRepository;
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

//		Employee employee = new Employee();
//		employee.setFirstName("Mohit");
//		employee.setLastName("Karjee");
//		employee.setEmailId("mohit.karjee@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Saket");
//		employee1.setLastName("Kumar");
//		employee1.setEmailId("savagesaket@gmail.com");
//		employeeRepository.save(employee1);
	}
}
