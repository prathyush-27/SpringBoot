package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype") //This will make the object creation default , so if there are any instance call then it will generate object
public class demo1
{
	
	private int id;
	private String name;
	private int number;
	
	@Autowired
	@Qualifier("demo2obj")
	private demo2 d2;
	
	//using this constructor to check how the obj created happen 
	public demo1()
	{
		super();
		System.out.println("\n Generating object using Constructor \n");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
	public demo2 getD2() {
		return d2;
	}
	public void setD2(demo2 d2) {
		this.d2 = d2;
	}
	public void show()
	{
		System.out.println("Showing From demo1 class");
		System.out.println("\n Calling complie method ");
		d2.compile();
		
	}
}
