package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.ShoeModel;
import com.example.demo.Repository.ShoeRepository;


@Service
public class ShoeService 
{
	@Autowired
	public ShoeRepository rrepo;
	public ShoeModel saveInfo(ShoeModel c)
	{
		return rrepo.save(c);
	}
	public List<ShoeModel> getInfo()
	{
		return rrepo.findAll();
	}
	public ShoeModel updateInfo(ShoeModel iu)
	{
		return rrepo.saveAndFlush(iu);
	}
	public void deleteInfo(int id)
	{
		rrepo.deleteById(id);
	}
}
