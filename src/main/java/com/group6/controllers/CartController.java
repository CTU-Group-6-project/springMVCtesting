package com.group6.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller	
public class CartController {

	@GetMapping("/cart")
	public String showCartPage() {
		System.out.println("In cart page");
		
		return "cart";
	}
}
