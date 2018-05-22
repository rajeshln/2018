package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStarterApplication {

	public static void main(String[] args) {
		
		// need to tell the spring to start the application , create servlet container and host this application 
		// and run it , below method does it for us 
		SpringApplication.run(SpringStarterApplication.class, args);
		
		System.out.println(" in spring boot application - Rajesh ");
	}
}
