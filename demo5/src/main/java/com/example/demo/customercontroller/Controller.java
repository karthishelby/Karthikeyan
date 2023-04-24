package com.example.demo.customercontroller;

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

import com.example.demo.customer.CustomerDetails;
import com.example.demo.customerservice.CustomerService;

@RestController
public class Controller 
{
@Autowired
public CustomerService cser;
@PostMapping("/postcs")
public CustomerDetails addDetails(@RequestBody CustomerDetails cs)
{
	return cser.saveInfo(cs);
}

@GetMapping("/getcs")
public List<CustomerDetails> getDetails()
{
	return cser.getInfo();
}

@PutMapping("/updatecs")

	public CustomerDetails updateDetails(@RequestBody CustomerDetails id)
	{
		return cser.updateInfo(id);
	}

@DeleteMapping("/deletecs/{cid}")
public String deleteDetails(@PathVariable ("cid") int id)
{
	cser.deleteInfo(id);
	return "Customer Number "+id+" is deleted";
}

@DeleteMapping("/deleteby")
public String deleteByReq(@RequestParam ("cid") int id)
{
	cser.deleteInfo(id);
	return "Customer Number "+id+" is deleted";
}

}

