package com.group6.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller	
public class AboutController {

	@GetMapping("/about")
	public String showAboutPage() {
		System.out.println("In about page");
		
		return "about";
	}
}
