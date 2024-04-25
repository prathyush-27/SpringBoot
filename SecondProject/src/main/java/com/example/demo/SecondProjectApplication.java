package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SecondProjectApplication {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context=	SpringApplication.run(SecondProjectApplication.class, args);
		demo1  d1= context.getBean(demo1.class);
		d1.show();
		
//		demo1 d01= context.getBean(demo1.class);
//		
//		d01.show();
		//to done this two object creation with the help of @Scope with the value of append
	}

}
