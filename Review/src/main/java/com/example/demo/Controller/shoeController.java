package com.example.demo.Controller;

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

import com.example.demo.Model.shoeModel;
import com.example.demo.Repository.shoeRepo;
import com.example.demo.Service.shoeService;


@RestController
public class shoeController 
{
	@Autowired
	public shoeService cser;
	@PostMapping("/postcss")
	public shoeModel addDetails(@RequestBody shoeModel cs)
	{
		return cser.saveInfo(cs);
	}

	@GetMapping("/getcss")
	public List<shoeModel> getDetails()
	{
		return cser.getInfo();
	}

	@PutMapping("/updatecss")

		public shoeModel updateDetails(@RequestBody shoeModel id)
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

@GetMapping("/sortDesc/{oname}")
public List<shoeModel> sortOwner(@PathVariable("oname") String ownername)
{
	return cser.sortDesc(ownername);
}

@GetMapping("/sortAsc/{oname}")
public List<shoeModel> sortOwnerasc(@PathVariable ("oname") String ownername)
{
	return cser.sortAsc(ownername);
}


@GetMapping("/pagination/{pnu}/{psize}")
public List <shoeModel> paginationData(@PathVariable ("pnu") int pnu, @PathVariable("psize")int psize)
{
	return cser.paginationData(pnu, psize);
}

@Autowired
public shoeRepo ir;
@GetMapping("/saveir")
public List<shoeModel> getD()
{
	return ir.getAllData();
}

@GetMapping("byName/{id}")
public List<shoeModel> getName(@PathVariable ("id") int pid )
{
	return ir.byshoenum(pid);
}

@GetMapping("startend/{start}/{end}")
public List<shoeModel> getStart(@PathVariable ("start")int start,@PathVariable ("end")int end)
{
	return ir.startEnd(start, end);
}

@DeleteMapping("/del/{id}/{name}")
public String delD(@PathVariable ("id") int id,@PathVariable ("name")String name)
{
	ir.deleteD(id, name);
	return "deleted";
}

@PutMapping("updatee/{pid}/{pname}")
public void updateQue(@PathVariable("pid")int pid,@PathVariable("pname") String pname)
{
	ir.updateByQuery(pid, pname);
}

}