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
		return "user_login";
	}
	
	@PostMapping("/login")
	public String processLogin(@Valid User user, Errors errors,   Model model) {
		System.out.println("user.name=" + user.getUsername());
		if (errors.hasErrors()) {
			System.out.println("found error in input");
			return "user_login";
		}
		System.out.println("no input errors");
		return "redirect:/";
	}
}
