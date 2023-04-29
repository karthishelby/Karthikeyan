package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.shoeLogin;

public interface shoeLoginrepo extends JpaRepository<shoeLogin ,Integer>
{
	shoeLogin findByusrname(String usrname);

}
