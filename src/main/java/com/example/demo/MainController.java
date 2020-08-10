package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String showIndex() {
		return "index";
	}

	@GetMapping("/search")
	public String showSearch() {
		return "search";
	}

	@GetMapping("/result")
	public String showResult() {
		return "search";
	}

	@GetMapping("/book")
	public String showBook() {
		return "book";
	}

	@GetMapping("/login")
	public String showLogin() {
		return "login";
	}
	
	@GetMapping("/contact")
	public String showContact() {
		return "contact";
	}
	
	@GetMapping("/about")
	public String showAbout() {
		return "about";
	}
}