package com.web_example.controller;


import com.web_example.model_class.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController
{
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	
	@PostMapping("/register")
	public String userRegister(@ModelAttribute User usr, Model mdl)
	{
		System.out.println(usr.toString());
		mdl.addAttribute("first_name", usr.getFirst_name());
		mdl.addAttribute("last_name", usr.getLast_name());
		return "welcome";
	}

}
