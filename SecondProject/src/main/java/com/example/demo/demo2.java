package com.example.demo;

import org.springframework.stereotype.Component;

@Component("demo2obj")
public class demo2 
{
	private int id;
	private String Nmae;
	private int mobno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNmae() {
		return Nmae;
	}
	public void setNmae(String nmae) {
		Nmae = nmae;
	}
	public int getMobno() {
		return mobno;
	}
	public void setMobno(int mobno) {
		this.mobno = mobno;
	}
	@Override
	public String toString() {
		return "demo2 [id=" + id + ", Nmae=" + Nmae + ", mobno=" + mobno + "]";
	}
	
	public void compile()
	{
		System.out.println("\n Cmpiling is called \n");
	}
}
