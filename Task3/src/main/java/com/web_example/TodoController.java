package com.web_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.web_example.repository.TodoRepository;

@Controller
public class TodoController 
{
	@Autowired
	private TodoRepository todorepo;
	
	@GetMapping("/")
	public String index(Model mdl)
	{
		mdl.addAttribute("todoItem",new TodoItem("", false));
		mdl.addAttribute("todos",todorepo.findAll());
		return "index";
	}
	
	@PostMapping("/addTodo")
	public String addTodo(@Validated TodoItem todoItem, BindingResult result, Model model) {
	    if (result.hasErrors()) {
	        model.addAttribute("todos", todorepo.findAll());
	        return "index";  // redirecting back to the form with error messages
	    }
	    todorepo.save(todoItem);
	    return "redirect:/";
	}

}
