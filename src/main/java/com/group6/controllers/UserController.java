package com.group6.controllers;



import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.group6.models.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@GetMapping("/login")
	public String displayLogin(Model model) {

		System.out.println("in user/login");
		User user = new User();
		model.addAttribute("user", user);
//		return "user_login";
		return "niceuser_login";
	}
	
	@PostMapping("/login")
	public String processLogin(@Valid User user, Errors errors,   Model model) {
		System.out.println("user.name=" + user.getUsername());
		System.out.println("user.name=" + user.getPassword());
		System.out.println("user.emailaddress=" + user.getEmailaddress());
//		if (user.getEmailaddress() != null && user.getEmailaddress().equals("psmanningjr@gmail.com") & 
//				user.getPassword() != null && user.getPassword().equals("paulsPassword")) {
//			System.out.println("Paul logged in");
//			return "redirect:/user/thank-you";
//		}
//		System.out.println("Invalid login");
//		return "niceuser_login";
		
		if (errors.hasErrors()) {
			System.out.println("found error in input");
			return "niceuser_login";
		}
		System.out.println("no input errors");
		return "redirect:/user/thank-you";
	}
	
	@GetMapping("/thank-you")
	public String thankyou() {
		System.out.println("thank you");
		return "thank-you";
	}
}
