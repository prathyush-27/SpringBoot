package com.web_example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService 
{
	@Autowired
	private  BookRepository bkrepo;
	
	public List<book> findAll()
	{
		return bkrepo.findAll();
	}
	
	public book save(book bk)
	{
		return bkrepo.save(bk);
	}
	
	public book findByID(int id) 
	{
		return bkrepo.findById(id).orElse(null);
	}
	
	public void deleteById(int id)
	{
		 bkrepo.deleteById(id);
	}
	
	
}
