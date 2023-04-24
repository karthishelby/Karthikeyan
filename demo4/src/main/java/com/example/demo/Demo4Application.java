package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class Demo4Application {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(Demo4Application.class, args);
		Person obj=new Person(8,"karthi","19");
		ObjectMapper o=new ObjectMapper();
		String p=o.writeValueAsString(obj);
		System.out.println(p);
	}

}
