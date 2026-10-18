package com.example.demo;

import com.example.demo.business.service.EmployeeService;
import com.example.demo.rest.model.EmployeeDTO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// Beispieldaten: werden einmal beim Start in die H2-Datenbank geschrieben
	@Bean
	CommandLineRunner initData(EmployeeService employeeService) {
		return args -> {
			employeeService.addEmployee(new EmployeeDTO(null, "Anna", "Schmidt", "anna.schmidt@mail.de"));
			employeeService.addEmployee(new EmployeeDTO(null, "Max", "Müller", "max.mueller@mail.de"));
			employeeService.addEmployee(new EmployeeDTO(null, "Lea", "Weber", "lea.weber@mail.de"));
		};
	}
}
