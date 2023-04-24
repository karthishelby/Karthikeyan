package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo {
	@RequestMapping("/a")
	public String h()
	{
		return "Welcome karthi";
	}

}
