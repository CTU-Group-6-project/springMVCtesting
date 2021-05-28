package com.group6.jBravo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/home").setViewName("home");
		registry.addViewController("/").setViewName("index");
		registry.addViewController("/hello").setViewName("hello");
		registry.addViewController("/credLogin").setViewName("credLogin");
		registry.addViewController("/about.html").setViewName("about");
		registry.addViewController("404.html").setViewName("404");
		registry.addViewController("cart.html").setViewName("cart");
		registry.addViewController("contactus.html").setViewName("contactus");
		registry.addViewController("checkout.html").setViewName("checkout");
		registry.addViewController("index.html").setViewName("index");
		registry.addViewController("index").setViewName("index");
		registry.addViewController("menu.html").setViewName("menu");
		registry.addViewController("login.html").setViewName("login");
		registry.addViewController("login").setViewName("login");
		registry.addViewController("thank-you.html").setViewName("thank-you");
		registry.addViewController("thank-you").setViewName("thank-you");
		registry.addViewController("my-account.html").setViewName("my-account");
		registry.addViewController("questions.html").setViewName("questions");
		registry.addViewController("submenu.html").setViewName("submenu");
		registry.addViewController("terms_conditions.html").setViewName("terms_conditions");
	}

}
