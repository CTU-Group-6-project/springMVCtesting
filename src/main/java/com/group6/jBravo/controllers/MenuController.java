package com.group6.jBravo.controllers;

import com.group6.jBravo.services.CartService;
import com.group6.jBravo.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuController {

    @Autowired
    private ItemService itemService;

    @Autowired
    private CartService cartService;

    @GetMapping("/menu.html")
    public String getMenuPage(Model model) {
        System.out.println("in get menu");
        model.addAttribute("pizzaItems",itemService.getPizzaItems());
        model.addAttribute("sandwichItems",itemService.getSandwichItems());
        model.addAttribute("saladItems",itemService.getSaladItems());
        model.addAttribute("beverageItems",itemService.getBeverageItems());
        model.addAttribute("cart", cartService.getCart());
        return "menu";
    }

//    @GetMapping("/{itemId}")
//    public String getProductById(Model model, @PathVariable("itemId") String itemId) {
//
////   	  model.addAttribute("item",itemService.getItemById(itemId));
//        return "item";
//    }

    @GetMapping("/home")
    public String getAllItemshome(Model model) {
        System.out.println("in get menu for home");
        model.addAttribute("items",itemService.getPizzaItems());
        return "home";
    }

}

