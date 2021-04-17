package com.group6.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.group6.models.OrderItem;

//import Services.ItemService;

import org.springframework.ui.Model;


@Controller
@RequestMapping("/items")
public class OrderItemController {

//	@Autowired
//	private ItemService itemService;
	
	@GetMapping("/all")
	public String getAllItems(Model model) {
		System.out.println("in get items/all");
		List<com.group6.models.OrderItem> listOfItems = new ArrayList<>();
		listOfItems.add(new OrderItem("1","Woah Mama Pizza", 
				"Tender chicken with our Ranch sauce, cheddar cheese, onions, bell peppers, jalapeños, bacon, & mozzarella cheese.",
				10.0));
		listOfItems.add(new OrderItem("2","BACON CHEESEBURGER",
				"Fresh-cooked juicy hamburger, bacon, cheddar cheese, onion, & mozzarella cheese.",
				9.89));
		listOfItems.add(new OrderItem("3","BBQ BLAST",
				"Juicy chicken with our BBQ sauce, cheddar cheese, onions, bell peppers, jalapeños, bacon & mozzarella cheese.",
				4.10));
		model.addAttribute("items",listOfItems);
//		model.addAttribute("items",itemService.getAllItems());
//		System.out.println(itemService.getAllItems());
		return "item_all";
	}
	
	 @GetMapping("/{itemId}")
     public String getProductById(Model model, @PathVariable("itemId") String itemId) {
   	 
//   	  model.addAttribute("item",itemService.getItemById(itemId));
   	  return "item";
     }
}
