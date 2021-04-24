package com.group6.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
	
//	@NotBlank(message="UserName can not be Empty")
//	@NotNull(message="username cannot be null")
	@Size(min = 4, max = 15)
	private String username;
	
//	@NotNull
//	@Size(min = 4, max = 15)
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
