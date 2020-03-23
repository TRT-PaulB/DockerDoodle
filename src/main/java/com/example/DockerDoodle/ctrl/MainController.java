package com.example.DockerDoodle.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping(value = "/hello")
	public String getTest() {
		return "just testing...";
	}
	
	// http://localhost:8080/hello
// Dockerish-0.0.1-SNAPSHOT.jar
	
	// .mvnw clean install
	// create Dockerfile
	// docker build -t dockerdoodle . 
	
	// docker run -p 5000:5000 -t
	 
}