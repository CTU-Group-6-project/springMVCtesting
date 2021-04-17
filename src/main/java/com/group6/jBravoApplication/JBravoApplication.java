package com.group6.jBravoApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
public class JBravoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JBravoApplication.class, args);
	}

}
