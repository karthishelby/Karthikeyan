package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.Model.shoeModel;
import com.example.demo.Repository.shoeRepo;


@Service
public class shoeService 
{
	@Autowired
	public shoeRepo rrepo;
	public shoeModel saveInfo(shoeModel c)
	{
		return rrepo.save(c);
	}
	public List<shoeModel> getInfo()
	{
		return rrepo.findAll();
	}
	public shoeModel updateInfo(shoeModel iu)
	{
		return rrepo.saveAndFlush(iu);
	}
	public void deleteInfo(int id)
	{
		rrepo.deleteById(id);
		
	}
public List <shoeModel> sortDesc (String oname)
{
	return rrepo.findAll(Sort.by(oname).descending());
}

public List<shoeModel> sortAsc (String oname)
{
	return rrepo.findAll(Sort.by(oname).ascending());
}
public List<shoeModel> paginationData (int pageNu,int pageSize)
{
	Page<shoeModel> p=rrepo.findAll (PageRequest.of(pageNu, pageSize));
	return p.getContent();
}
}
