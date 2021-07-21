package com.group6.jBravo.controllers;

import com.group6.jBravo.WebSecurityConfig;
import com.group6.jBravo.models.OrderItem;
import com.group6.jBravo.models.ThankYouInfo;
import com.group6.jBravo.models.UserInfo;
import com.group6.jBravo.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;

import static com.group6.jBravo.WebSecurityConfig.*;

@Controller	
public class HomeController {
	private DriverManagerDataSource dataSource;

	Connection c = null;
	Statement stmt = null;


	List<OrderItem> menuItems;

	@Autowired
	UserDetailsService userDetailsService;

	@Autowired
	private CartService cartService;

	@Autowired
	PasswordEncoder passwordEncoder;

	public HomeController() throws SQLException {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(WebSecurityConfig.JBDC_DRIVER);
		dataSource.setUrl(WebSecurityConfig.JBDC_URL);
		dataSource.setUsername(WebSecurityConfig.JBDC_USERNAME);
		dataSource.setPassword(WebSecurityConfig.JBDC_PASSWORD);
	}

	private void initDbConnection() throws SQLException {
		c = dataSource.getConnection();
		stmt = null;

	}

	private void closeDbConnection() throws SQLException {
		stmt.close();
		c.close();
	}

	private boolean executeSQL(String sql)  {
		try {
			stmt = c.createStatement();
			stmt.executeUpdate(sql);
		} catch ( Exception e ) {
			System.err.println ( e.getClass().getName()+": "+ e.getMessage() );
			return false;
		}
		return true;
	}

	@GetMapping(value={"/", "/index", "/index.html"})
	public String showHomePage(Model model) {
		System.out.println("In Home page");
		model.addAttribute("cart", cartService.getCart());
		System.out.println(cartService.getCart());
//		InMemoryUserDetailsManager inMemoryUserDetailsManager = (InMemoryUserDetailsManager) userDetailsService;
//		UserDetails user =
//				 User.withDefaultPasswordEncoder()
//					.username("paul@work.com")
//					.password("password1234")
//					.roles("MANAGER")
//					.build();
//		if (!inMemoryUserDetailsManager.userExists("paul@work.com")) {
//			System.out.println("added paul@work.com");
//			inMemoryUserDetailsManager.createUser(user);
//		}
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
//		com.group6.jBravo.models.User user = new com.group6.jBravo.models.User();
//		model.addAttribute("user",user);
//		InMemoryUserDetailsManager inMemoryUserDetailsManager = (InMemoryUserDetailsManager) userDetailsService;
//		System.out.println("User name = " + user.getUsername());
//		model.addAttribute("cart", cartService.getCart());
//		System.out.println(cartService.getCart());
		return "login";
	}


	@PostMapping("/registerlogin")
	public String addUserPage(@ModelAttribute UserInfo userInfo, Model model) throws SQLException {
		System.out.println("in register login");
		model.addAttribute("userInfo", userInfo);
		System.out.println("username entered = " + userInfo.getUsername() + " " + userInfo.getPassword());
		initDbConnection();
		String ADD_USER_TO_USERS_SQL = ADD_USER_TO_USERS_PREFIX_SQL + userInfo.getUsername() +
				QUOTE_COMMAN_QUOTE_SEPARATOR + passwordEncoder.encode(userInfo.getPassword()) + USER_ENABLED_AND_END;
		executeSQL(ADD_USER_TO_USERS_SQL);
		closeDbConnection();

		return "login";
	}

}
//@Controller
//@RequestMapping("/user")
//public class UserController {
//
//	@GetMapping("/login")
//	public String displayLogin(Model model) {
//
//		System.out.println("in user/login");
//		User user = new User();
//		model.addAttribute("user", user);
////		return "user_login";
//		return "niceuser_login";
//	}
//
//	@PostMapping("/login")
//	public String processLogin(@Valid User user, Errors errors, Model model) {
//		System.out.println("user.name=" + user.getUsername());
//		System.out.println("user.name=" + user.getPassword());
//		System.out.println("user.emailaddress=" + user.getEmailaddress());
////		if (user.getEmailaddress() != null && user.getEmailaddress().equals("psmanningjr@gmail.com") &
////				user.getPassword() != null && user.getPassword().equals("paulsPassword")) {
////			System.out.println("Paul logged in");
////			return "redirect:/user/thank-you";
////		}
////		System.out.println("Invalid login");
////		return "niceuser_login";
//
//		if (errors.hasErrors()) {
//			System.out.println("found error in input");
//			return "niceuser_login";
//		}
//		System.out.println("no input errors");
//		return "redirect:/user/thank-you";
//	}
//
