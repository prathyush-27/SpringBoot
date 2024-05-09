package com.web_example;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class BookController 
{
	@Autowired
	private BookService bkservc;
	
	@GetMapping("/")
	public String viewHomePage(Model mdl)
	{
		mdl.addAttribute("book",new book());
		mdl.addAttribute("listBooks",bkservc.findAll());
		return "index";
	}
	
	@PostMapping("/saveBook")
	public String saveBook(@ModelAttribute("book")book bk)
		{
			bkservc.save(bk);
			return "redirect:/";
		}
	@GetMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable int id)
	{
		bkservc.deleteById(id);
		return "redirect:/";
	}
	
	 @GetMapping("/test")
	    public String test() {
	        return "This is a test";
	    }
	
}
