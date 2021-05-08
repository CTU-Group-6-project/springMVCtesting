package com.group6.jBravo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller	
public class HomeController {
	
	@Autowired
	UserDetailsService userDetailsService;
	
	@GetMapping("/")
	public String showHomePage() {
		System.out.println("In Home page");
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
}
