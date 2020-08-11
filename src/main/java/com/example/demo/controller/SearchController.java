package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SearchController {
	@GetMapping("/search")
	public String showSearch() {
		return "search";
	}

	@GetMapping("/result")
	public String showResult() {
		return "search";
	}
}
