package com.group6.jBravo.services;

import com.group6.jBravo.models.OrderItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class ItemService {

    public List<OrderItem> getAllItems() {

        List<OrderItem> listOfItems = new ArrayList<>();
        listOfItems.add(new OrderItem("1", "images/woahmama.png", "Woah Mama Pizza",
                "Tender chicken with our Ranch sauce, cheddar cheese, onions, bell peppers, jalapeños, bacon, & mozzarella cheese.",
                "10.00"));
        listOfItems.add(new OrderItem("2","images/Bacon-Cheeseburger.png", "BACON CHEESEBURGER",
                "Fresh-cooked juicy hamburger, bacon, cheddar cheese, onion, & mozzarella cheese.",
                "9.89"));
        listOfItems.add(new OrderItem("3", "images/BBQ-Blast.png","BBQ BLAST",
                "Juicy chicken with our BBQ sauce, cheddar cheese, onions, bell peppers, jalapeños, bacon & mozzarella cheese.",
                "4.10"));
        listOfItems.add(new OrderItem("4", "images/Buffalo-Chicken.png","Buffalo Chicken",
                "Grilled chicken with our Buffalo sauce, cheddar cheese, onions, bell peppers, jalapeños, bacon, & mozzarella cheese.",
                "10.00"));
        listOfItems.add(new OrderItem("5", "images/Chicken-Ranchero.png","Chicken Ranchero",
                "Tender chicken with our Ranch sauce, cheddar cheese, onions, bell peppers, jalapeños, bacon, & mozzarella cheese.",
                "10.00"));
        listOfItems.add(new OrderItem("6", "images/Hog-Heaven.png","Hog Heaven",
                "Revved up with smoked ham, bacon, sausage, spicy smoked andouille, jalapeños, & mozzarella cheese.",
                "10.00"));
        listOfItems.add(new OrderItem("7", "images/Maui-Wowie.png","Maui Wowie",
                "A taste of the island life with sweet pineapple, smoked ham, bacon, & mozzarella cheese.",
                "10.00"));
        listOfItems.add(new OrderItem("8", "images/Mighty-Meaty.png","Mighty Meaty",
                "Loaded up with pepperoni, ham, bacon, hamburger, sausage, & mozzarella cheese.",
                "10.00"));
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
