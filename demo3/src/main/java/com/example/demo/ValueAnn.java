package com.example.demo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class ValueAnn {
	@Value("${carname}")
	public String car;
	@GetMapping("/kk")
	@ResponseBody
	public String disp() {
		return "My Fav Car "+car;
	}
}
