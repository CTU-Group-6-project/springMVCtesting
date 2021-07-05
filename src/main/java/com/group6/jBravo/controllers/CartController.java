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

    @GetMapping(value={"/cart.html","cart"})
    public String getCartPage(Model model) {
        System.out.println("in get cart");
        model.addAttribute("cart", cartService.getCart());
        return "cart";
    }

    @GetMapping("/addItem")
    public String addItem(String itemId, String sizeSelect) {
        System.out.println("in add Item");
        System.out.println("item = " + itemId);
        System.out.println("size = '" + sizeSelect + "'");
        cartService.addItem(itemId, sizeSelect);
        return ("redirect:menu.html");
    }

    @GetMapping("/deleteItem")
    public String deleteItem(String itemId, String sizeSelect) {
        System.out.println("in delete Item");
        System.out.println("item = " + itemId);
        System.out.println("size = '" + sizeSelect + "'");
        cartService.deleteItem(itemId, sizeSelect);
        return ("redirect:cart.html");
    }

    @GetMapping("/incrementItem")
    public String incrementItem(String itemId, String sizeSelect) {
        System.out.println("in increment Item");
        System.out.println("item = " + itemId);
        System.out.println("size = '" + sizeSelect + "'");
        cartService.incrementItem(itemId, sizeSelect);
        return ("redirect:cart.html");
    }

    @GetMapping("/decrementItem")
    public String decrementItem(String itemId, String sizeSelect) {
        System.out.println("in decrement Item");
        System.out.println("item = " + itemId);
        System.out.println("size = '" + sizeSelect + "'");
        cartService.decrementItem(itemId, sizeSelect);
        return ("redirect:cart.html");
    }

    @GetMapping("/setdelivery")
    public String setDelivery(String deliver_type) {
        System.out.println("in set delivery");
        System.out.println("delivery selected = " + deliver_type);
        cartService.setDeliveryOption(deliver_type);
        return ("redirect:cart.html");
    }
}
