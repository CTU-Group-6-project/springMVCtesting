package com.group6.jBravo.services;

import com.group6.jBravo.models.OrderItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class ItemService {

    public List<OrderItem> getPizzaItems() {

        List<OrderItem> listOfItems = new ArrayList<>();
        listOfItems.add(new OrderItem("1", "images/woahmama.png", "Woah Mama Pizza",
                "Tender chicken with our Ranch sauce, cheddar cheese, onions, bell peppers, jalapeños, bacon, & mozzarella cheese.",
                "10.00", OrderItem.PIZZA_CATEGORY, OrderItem.THREE_SIZES));
        listOfItems.add(new OrderItem("2","images/Bacon-Cheeseburger.png", "BACON CHEESEBURGER",
                "Fresh-cooked juicy hamburger, bacon, cheddar cheese, onion, & mozzarella cheese.",
                "9.89", OrderItem.PIZZA_CATEGORY, OrderItem.THREE_SIZES));
        listOfItems.add(new OrderItem("3", "images/BBQ-Blast.png","BBQ BLAST",
                "Juicy chicken with our BBQ sauce, cheddar cheese, onions, bell peppers, jalapeños, bacon & mozzarella cheese.",
                "4.10", OrderItem.PIZZA_CATEGORY, OrderItem.THREE_SIZES));
        listOfItems.add(new OrderItem("4", "images/Buffalo-Chicken.png","Buffalo Chicken",
                "Grilled chicken with our Buffalo sauce, cheddar cheese, onions, bell peppers, jalapeños, bacon, & mozzarella cheese.",
                "10.00", OrderItem.PIZZA_CATEGORY, OrderItem.THREE_SIZES));
        listOfItems.add(new OrderItem("5", "images/Chicken-Ranchero.png","Chicken Ranchero",
                "Tender chicken with our Ranch sauce, cheddar cheese, onions, bell peppers, jalapeños, bacon, & mozzarella cheese.",
                "10.00", OrderItem.PIZZA_CATEGORY, OrderItem.THREE_SIZES));
        listOfItems.add(new OrderItem("6", "images/Hog-Heaven.png","Hog Heaven",
                "Revved up with smoked ham, bacon, sausage, spicy smoked andouille, jalapeños, & mozzarella cheese.",
                "10.00", OrderItem.PIZZA_CATEGORY, OrderItem.THREE_SIZES));
        listOfItems.add(new OrderItem("7", "images/Maui-Wowie.png","Maui Wowie",
                "A taste of the island life with sweet pineapple, smoked ham, bacon, & mozzarella cheese.",
                "10.00", OrderItem.PIZZA_CATEGORY, OrderItem.THREE_SIZES));
        listOfItems.add(new OrderItem("8", "images/Mighty-Meaty.png","Mighty Meaty",
                "Loaded up with pepperoni, ham, bacon, hamburger, sausage, & mozzarella cheese.",
                "10.00", OrderItem.PIZZA_CATEGORY, OrderItem.THREE_SIZES));
        return listOfItems;
    }

    public List<OrderItem> getSandwichItems() {

        List<OrderItem> listOfItems = new ArrayList<>();
        listOfItems.add(new OrderItem("1001", "images/BBQ-Chicken-Flip-02.png", "BBQ-Chicken flip",
                "Juicy chicken with our BBQ sauce, cheddar cheese, onions, bell peppers, jalapeños, bacon & mozzarella cheese.",
                "10.00", OrderItem.SANDWICH_CATEGORY, OrderItem.SINGLE_SIZE));
        listOfItems.add(new OrderItem("1002","images/Buffalo-Chicken-Flip-02.png", "Buffalo-Chicken Flip",
                "Grilled chicken with our Buffalo sauce, cheddar cheese, onions, bell peppers, jalapeños, bacon, & mozzarella cheese.",
                "10.00", OrderItem.SANDWICH_CATEGORY, OrderItem.SINGLE_SIZE));
        listOfItems.add(new OrderItem("1003", "images/Chicken-Ranchero-Flip-02.png","Chicken-Ranchero Flip",
                "Tender chicken with our Ranch sauce, cheddar cheese, onions, bell peppers, jalapeños, bacon, & mozzarella cheese.",
                "12.00", OrderItem.SANDWICH_CATEGORY, OrderItem.SINGLE_SIZE));
        listOfItems.add(new OrderItem("1004", "images/Ham-and-Cheese-Flip-02.png","Ham and Cheese Flip",
                "Filled with delicious ham and nacho cheese!",
                "15.00", OrderItem.SANDWICH_CATEGORY, OrderItem.SINGLE_SIZE));
        listOfItems.add(new OrderItem("1005", "images/Mighty-Meaty-Flip-02.png","Mighty Meaty Flip",
                "Tender ham, pepperoni, real bacon, 100% mozzarella cheese.",
                "10.00", OrderItem.SANDWICH_CATEGORY, OrderItem.SINGLE_SIZE));
        listOfItems.add(new OrderItem("1006", "images/Muffuletta-Flip-02.png","Muffuletta Flip",
                "Spicy salami, tender ham, mustard, olive mix and 100% mozzarella cheese!",
                "15.00", OrderItem.SANDWICH_CATEGORY, OrderItem.SINGLE_SIZE));
        return listOfItems;
    }

    public List<OrderItem> getBeverageItems() {

        List<OrderItem> listOfItems = new ArrayList<>();
        listOfItems.add(new OrderItem("4001", "images/margarita5.png", "WHO’S TO BLAME",
                "jBravo Gold Tequila, triple sec and our house margarita blend.",
                "10.00", OrderItem.BEVERAGE_CATEGORY, OrderItem.THREE_SIZES));
        listOfItems.add(new OrderItem("4002","images/Margarita.png", "TOP SHELF MARGARITA",
                "jBravo Gold Tequila, Cointreau® Orange Liqueur, our house margarita blend topped with a Gran Gala® float. Excellent on the rocks.",
                "10.00", OrderItem.BEVERAGE_CATEGORY, OrderItem.THREE_SIZES));
        listOfItems.add(new OrderItem("4003", "images/Margarita1.png","FINS TO THE LEFT",
                "jBravo Silver Tequila, blue curaçao and our house margarita blend.",
                "10.00", OrderItem.BEVERAGE_CATEGORY, OrderItem.THREE_SIZES));
        listOfItems.add(new OrderItem("4004", "images/Drink6.png","LAST MANGO IN PARIS",
                "jBravo Last Mango Tequila, Cointreau® Orange Liqueur, our house margarita blend and cranberry juice. Served on the rocks.",
                "10.00", OrderItem.BEVERAGE_CATEGORY, OrderItem.THREE_SIZES));
        listOfItems.add(new OrderItem("4005", "images/Drink8.png","GINGER CITRUS MARGARITA",
                "jBravo Gold Tequila, triple sec and our house ginger-infused margarita blend.",
                "10.00", OrderItem.BEVERAGE_CATEGORY, OrderItem.THREE_SIZES));
        listOfItems.add(new OrderItem("4006", "images/drink9.png","WATERMELON MARGARITA",
                "jBravo Silver Tequila, triple sec, watermelon purée and our house margarita blend.",
                "10.00", OrderItem.BEVERAGE_CATEGORY, OrderItem.THREE_SIZES));
        return listOfItems;
    }

    public List<OrderItem> getSaladItems() {

        List<OrderItem> listOfItems = new ArrayList<>();
        listOfItems.add(new OrderItem("2001", "images/Chicken-Bacon-Salad.png", "Chicken Bacon Salad",
                "Crisp fresh lettuce, chicken, bacon, cheddar, red onion, bell pepper, & tomato.",
                "10.00", OrderItem.SALAD_CATEGORY, OrderItem.SINGLE_SIZE));
        listOfItems.add(new OrderItem("2002","images/Chef-Salad.png", "Chef Salad",
                "Crisp fresh lettuce, ham, turkey, cheddar, eggs, tomato, red onion, & cucumber.",
                "10.00", OrderItem.SALAD_CATEGORY, OrderItem.SINGLE_SIZE));
        listOfItems.add(new OrderItem("2003", "images/Garden-Salad.png","Garden Salad",
                "Crisp fresh lettuce, tomato, cheddar, cucumber, & red onion.",
                "10.00", OrderItem.SALAD_CATEGORY, OrderItem.SINGLE_SIZE));
        return listOfItems;
    }

    public OrderItem getItemById(String id) {

        Predicate<OrderItem> byId = p -> p.getId().equals(id);
        return filterItems(byId);
    }

    public OrderItem filterItems(Predicate<OrderItem> strategy) {
        return getPizzaItems().stream().filter(strategy).findFirst().orElse(null);
    }
}
