package com.group6.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller	
public class MenuController {

	@GetMapping("/menu")
	public String showMenuPage() {
		System.out.println("In menu page");
		
		return "menu";
	}
}
