package com.example.demo.Contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.ShoeModel;
import com.example.demo.Service.ShoeService;
@RestController
public class ShoeController 
{
	@Autowired
	public ShoeService cser;
	@PostMapping("/postcss")
	public ShoeModel addDetails(@RequestBody ShoeModel cs)
	{
		return cser.saveInfo(cs);
	}

	@GetMapping("/getcss")
	public List<ShoeModel> getDetails()
	{
		return cser.getInfo();
	}

	@PutMapping("/updatecss")

		public ShoeModel updateDetails(@RequestBody ShoeModel id)
		{
			return cser.updateInfo(id);
		}

	@DeleteMapping("/deletecss/{cid}")
	public String deleteDetails(@PathVariable ("cid") int shoestorenum)
	{
		cser.deleteInfo(shoestorenum);
		return "Customer Number "+shoestorenum+" is deleted";
	}

	@DeleteMapping("/deletebyy")
	public String deleteByReq(@RequestParam ("cid") int shoestorenum)
	{
		cser.deleteInfo(shoestorenum);
		return "Customer Number "+shoestorenum+" is deleted";
	}

}
