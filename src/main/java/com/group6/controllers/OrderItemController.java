package com.group6.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.group6.models.OrderItem;
import com.group6.models.Product;

//import Services.ItemService;

import org.springframework.ui.Model;


@Controller
@RequestMapping("/items")
public class OrderItemController {

//	@Autowired
//	private ItemService itemService;
	
	public List<Product> getAllProducts() {
		
		List<Product> listOfProducts = new ArrayList<>();
		listOfProducts.add(new Product("123", "IPHONE X", "This is Awesome Iphone ", 400.4, "Apple Inc"));
		listOfProducts.add(new Product("124", "Samsung Y", "This is Awesome Samsung ", 300.4, "Samsung Inc"));
		listOfProducts.add(new Product("125", "LG Z", "This is Awesome LG ", 200.4, "LG Inc"));

		return listOfProducts;
	}

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
//		model.addAttribute("products",getAllProducts());
//		model.addAttribute("items",getAllProducts());
//		model.addAttribute("products",listOfItems);
//		model.addAttribute("items",itemService.getAllItems());
//		System.out.println(itemService.getAllItems());
//		return "junk";
		return "item_all";
	}
	
	 @GetMapping("/{itemId}")
     public String getProductById(Model model, @PathVariable("itemId") String itemId) {
   	 
//   	  model.addAttribute("item",itemService.getItemById(itemId));
   	  return "item";
     }
}
