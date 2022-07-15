package com.ccf.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ccf.dto.Employee;

@RestController
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "Welcome to HomePage ! This Project is deployed using Jenkins and CI/CD";
	}

	@GetMapping("/employee")
	public ResponseEntity<Employee> getEmployee() {

		return new ResponseEntity<Employee>(new Employee("Tony", "Stark", "tony@stark.com"), HttpStatus.OK);

	}
	
	
	@GetMapping("/about")
	public String about() {
		return "This Project is Simple Spring Boot Application.I have used Jenkins to Build PipeLine."
				+ "Two Individual EC2 instances have been created and I have installed Jenkins and Tomcat on them."
				+ "For VCS GitHub is used.";
	}
	
	

}
