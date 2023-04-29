package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.shoeLogin;
import com.example.demo.Repository.shoeLoginrepo;

@Service

public class shoeLoginser {
	@Autowired
	private shoeLoginrepo lrepo;
	public String checkLogin(String usrname,String psword)
	{
		shoeLogin user= lrepo.findByusrname(usrname);
		if(user==null)
		{
			return "No user found";
		}
		else
		{
			if(user.getPsword().equals(psword))
			{
				return "Login Succesfull";
			}
			else
			{
				return "Login Failed";
			}
		}
	} 
	public shoeLogin addUser(shoeLogin cl)
	{
		return lrepo.save(cl);
	}
	public List<shoeLogin> getUser()
	{
		return lrepo.findAll();
	}

}
