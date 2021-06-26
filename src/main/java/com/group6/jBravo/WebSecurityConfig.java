package com.group6.jBravo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.group6.jBravo.services.RefererRedirectionAuthenticationSuccessHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	UserDetailsService userDetailsService;

	private final ObjectMapper objectMapper = new ObjectMapper();
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers("/", "/home","/images/**", "/css/**", "/js/**", "/fonts/**",
						"/about.html", "/contactus.html","/questions.html","/submenu.html",
						"/terms_conditions.html", "/thank-you.html", "/index.html").permitAll()
				.anyRequest().authenticated()
				.and()
			.formLogin()
				.loginPage("/login")
				.permitAll()
				.successHandler(this::loginSuccessHandler)
//				.successHandler(new RefererRedirectionAuthenticationSuccessHandler())
				.and()
			.logout()
				.permitAll();
	}

	private void loginSuccessHandler(
			HttpServletRequest request,
			HttpServletResponse response,
			Authentication authentication) throws IOException {

		response.setStatus(HttpStatus.OK.value());
		System.out.println("successfully logged in");
		response.sendRedirect(request.getContextPath());
		System.out.println("context path = " + request.getContextPath());
		System.out.println("remote userid = "  + request.getRemoteUser());
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		String username;
		if (principal instanceof UserDetails) {
			username = ((UserDetails)principal).getUsername();
		} else {
			username = principal.toString();
		}
		System.out.println("logged into "+ username);
		String referrer = request.getHeader("Referer");
		System.out.println("referer = " + referrer);
//		InMemoryUserDetailsManager inMemoryUserDetailsManager = (InMemoryUserDetailsManager) userDetailsService;
//		objectMapper.writeValue(response.getWriter(), "Yayy you logged in!");
	}

	@Bean
	@Override
	public UserDetailsService userDetailsService() {
		UserDetails user =
			 User.withDefaultPasswordEncoder()
				.username("user@home.com")
				.password("longpassword")
				.roles("USER")
				.build();
		
		return new InMemoryUserDetailsManager(user);
	}
}
