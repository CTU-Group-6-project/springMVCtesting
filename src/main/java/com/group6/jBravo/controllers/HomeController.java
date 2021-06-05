package com.group6.jBravo.controllers;

import com.group6.jBravo.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller	
public class HomeController {
	
	@Autowired
	UserDetailsService userDetailsService;

	@Autowired
	private CartService cartService;

	@GetMapping(value={"/", "/index", "/index.html"})
	public String showHomePage(Model model) {
		System.out.println("In Home page");
		model.addAttribute("cart", cartService.getCart());
		System.out.println(cartService.getCart());
		InMemoryUserDetailsManager inMemoryUserDetailsManager = (InMemoryUserDetailsManager) userDetailsService;
		UserDetails user =
				 User.withDefaultPasswordEncoder()
					.username("paul@work.com")
					.password("password1234")
					.roles("MANAGER")
					.build();
		if (!inMemoryUserDetailsManager.userExists("paul@work.com")) {
			System.out.println("added paul@work.com");
			inMemoryUserDetailsManager.createUser(user);
		}
		return "index";
	}

	@GetMapping(value={"/about", "/about.html"})
	public String showAboutPage(Model model) {
		System.out.println("In about page");
		model.addAttribute("cart", cartService.getCart());
		System.out.println(cartService.getCart());
		return "about";
	}

	@GetMapping(value={"/questions", "/questions.html"})
	public String showQuestioinPage(Model model) {
		System.out.println("In questions page");
		model.addAttribute("cart", cartService.getCart());
		System.out.println(cartService.getCart());
		return "questions";
	}

	@GetMapping(value={"/terms_conditions", "/terms_conditions.html"})
	public String showTermsConditionsPage(Model model) {
		System.out.println("In terms and conditions page");
		model.addAttribute("cart", cartService.getCart());
		System.out.println(cartService.getCart());
		return "terms_conditions";
	}


	@GetMapping(value={"/contactus", "/contactus.html"})
	public String showContactUsPage(Model model) {
		System.out.println("In contact us page");
		model.addAttribute("cart", cartService.getCart());
		System.out.println(cartService.getCart());
		return "contactus";
	}

	@GetMapping(value={"/login", "/login.html"})
	public String showLoginPage(Model model) {
		System.out.println("In log in page");
		model.addAttribute("cart", cartService.getCart());
		System.out.println(cartService.getCart());
		return "login";
	}
}
