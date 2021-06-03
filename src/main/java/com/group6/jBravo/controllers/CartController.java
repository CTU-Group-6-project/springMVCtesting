package com.group6.jBravo.controllers;

import com.group6.jBravo.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping("/cart.html")
    public String getCartPage(Model model) {
        System.out.println("in get cart");
        model.addAttribute("cart", cartService.getCart());
        return "cart";
    }
}
