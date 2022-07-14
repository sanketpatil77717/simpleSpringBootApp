package com.ccf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	@GetMapping("/")
	public String home() {
		return "Welcome to HomePage ! This Project is deployed using Jenkins and CI/CD";
	}

}
