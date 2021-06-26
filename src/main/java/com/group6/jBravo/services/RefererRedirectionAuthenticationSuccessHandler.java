package com.group6.jBravo.services;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

public class RefererRedirectionAuthenticationSuccessHandler
        extends SimpleUrlAuthenticationSuccessHandler
        implements AuthenticationSuccessHandler {

    public RefererRedirectionAuthenticationSuccessHandler() {
        super();
        System.out.println("successfully logged in");
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        String username;
        if (principal instanceof UserDetails) {
            username = ((UserDetails)principal).getUsername();
        } else {
            username = principal.toString();
        }
        System.out.println("logged into "+ username);

        setUseReferer(true);
    }

}