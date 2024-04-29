package com.web_example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
public class TodoController 
{
	private final List<TodoItem> todos = new ArrayList<>();
	
	@GetMapping("/")
	public String index(Model mdl) 
	{
		mdl.addAttribute("todoItem",new TodoItem(""));
		mdl.addAttribute("todos",todos);
		return "index";
	}
	
	@PostMapping("/addTodo")
	public String addTodo(@ModelAttribute TodoItem ti,Model mdl)
	{
		
		todos.add(ti);
		return "redirect:/";
		
	}
	
}
