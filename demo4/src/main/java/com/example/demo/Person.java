package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Person {
	int id;
	@JsonIgnore
	String name;
	String age;
	public Person(int id, String name, String age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	

}
