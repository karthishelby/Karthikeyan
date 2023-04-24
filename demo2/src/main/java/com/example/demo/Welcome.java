package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
	
	
	public String name="pakki";
	@GetMapping("/hi")
	public String display() {
		return "Welcome "+name;
	}

}