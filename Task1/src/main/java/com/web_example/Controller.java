package com.web_example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller 
{
	@GetMapping("/")
	
	public String sayHello()
	{
		return "Hello World";
	}
}
