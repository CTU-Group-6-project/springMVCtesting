package com.group6.jBravo.controllers;

import com.group6.jBravo.services.CartService;
import com.group6.jBravo.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

    @Autowired
    private ItemService itemService;

    @Autowired
    private CartService cartService;

    @GetMapping("/menu.html")
    public String getMenuPage(Model model) {
        System.out.println("in get menu");
        model.addAttribute("menuItems",itemService.getMenuItems());
        model.addAttribute("cart", cartService.getCart());
        return "menu";
    }

    @GetMapping("/checkout.html")
    public String getCheckoutPage(Model model) {
        System.out.println("in checkout menu");
        model.addAttribute("cart", cartService.getCart());
        return "checkout";
    }

    @GetMapping("/home")
    public String getAllItemshome(Model model) {
        System.out.println("in get menu for home");
        model.addAttribute("items",itemService.getMenuItems());
        return "home";
    }

}

