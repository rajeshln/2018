package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// makes any class rest controller 
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi!!";
	}

}
