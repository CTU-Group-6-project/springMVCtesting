package com.group6.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller	
public class HomeController {

	@GetMapping("/")
	public String showHomePage() {
		System.out.println("In Home page");
		
		return "home";
	}
}
