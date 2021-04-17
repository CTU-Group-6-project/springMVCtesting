package com.group6.services;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.group6.models.OrderItem;

@Service
public class ItemService {

public List<OrderItem> getAllItems() {
		
		List<OrderItem> listOfItems = new ArrayList<>();
		listOfItems.add(new OrderItem("1","Woah Mama Pizza", 
				"Tender chicken with our Ranch sauce, cheddar cheese, onions, bell peppers, jalapeños, bacon, & mozzarella cheese.",
				10.0));
		listOfItems.add(new OrderItem("2","BACON CHEESEBURGER",
				"Fresh-cooked juicy hamburger, bacon, cheddar cheese, onion, & mozzarella cheese.",
				9.89));
		listOfItems.add(new OrderItem("3","BBQ BLAST",
				"Juicy chicken with our BBQ sauce, cheddar cheese, onions, bell peppers, jalapeños, bacon & mozzarella cheese.",
				4.10));

		return listOfItems;
	}

	public OrderItem getItemById(String id) {

		Predicate<OrderItem> byId = p -> p.getId().equals(id);
		return filterItems(byId);
	}

	public OrderItem filterItems(Predicate<OrderItem> strategy) {
		return getAllItems().stream().filter(strategy).findFirst().orElse(null);
	}
}
