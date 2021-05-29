package com.group6.jBravo.services;

import com.group6.jBravo.models.Cart;
import com.group6.jBravo.models.CartItem;
import com.group6.jBravo.models.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {
    Cart cart;

    public CartService() {
        cart = createEmptyCart();
        populateCartForTesting();
    }

    private void populateCartForTesting() {
        List<CartItem> listOfItems = new ArrayList<>();
        listOfItems.add(new CartItem(
                new OrderItem("1", "images/woahmama.png", "Woah Mama Pizza",
                        "Tender chicken with our Ranch sauce, cheddar cheese, onions, bell peppers, jalapeños, bacon, & mozzarella cheese.",
                        "10.00", OrderItem.PIZZA_CATEGORY, OrderItem.THREE_SIZES,"images/cartItem.png"),
                1,CartItem.SIZE_EXTRA_LARGE,"10.00"));
        listOfItems.add(new CartItem(
                new OrderItem("4001", "images/margarita5.png", "WHO’S TO BLAME",
                        "jBravo Gold Tequila, triple sec and our house margarita blend.",
                        "10.00", OrderItem.BEVERAGE_CATEGORY, OrderItem.THREE_SIZES,"images/cartItem.png"),
                1,CartItem.SIZE_EXTRA_LARGE,"10.00"));
        listOfItems.add(new CartItem(
                new OrderItem("1001", "images/BBQ-Chicken-Flip-02.png", "BBQ-Chicken flip",
                "Juicy chicken with our BBQ sauce, cheddar cheese, onions, bell peppers, jalapeños, bacon & mozzarella cheese.",
                "10.00", OrderItem.SANDWICH_CATEGORY, OrderItem.SINGLE_SIZE,"images/cartItem.png"),
                2, CartItem.SIZE_ONLY, "10.00"));
        cart.setItems(listOfItems);
        cart.setTotalCost("30.00");
        cart.setDeliveryMethod(Cart.ORDER_DELIVERY);
        cart.setTotalCostWithDelivery("35.00");
    }

    private Cart createEmptyCart() {
        return new Cart("",Cart.ORDER_PICKUP, "0.00","0.00", new ArrayList<CartItem>());
    }

    public Cart getCart() {
        return cart;
    }
}