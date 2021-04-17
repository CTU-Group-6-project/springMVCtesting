package com.group6.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.group6.services.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {

      @Autowired
	  private ProductService productService;
      @GetMapping("/all")  
	  public String getAllProducts(Model model) {	 
 		model.addAttribute("products",productService.getAllProducts());
 		System.out.println("in products/all");
		  return "product_all";
	  }
     
      @GetMapping("/{productId}")
      public String getProductById(Model model, @PathVariable("productId") String productId) {
    	 
    	  model.addAttribute("product",productService.getProductById(productId));
    	  return "product";
      }
}
