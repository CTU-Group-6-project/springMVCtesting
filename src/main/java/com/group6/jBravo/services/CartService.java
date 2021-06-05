package com.group6.jBravo.services;

import com.group6.jBravo.models.Cart;
import com.group6.jBravo.models.CartItem;
import com.group6.jBravo.models.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class CartService {

    @Autowired
    private ItemService itemService;

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
                        "10.00", "12.00", "14.00", OrderItem.PIZZA_CATEGORY, OrderItem.THREE_SIZES,"images/cartItem.png"),
                1,CartItem.SIZE_MEDIUM,"10.00"));
        listOfItems.add(new CartItem(
                new OrderItem("4001", "images/margarita5.png", "WHO’S TO BLAME",
                        "jBravo Gold Tequila, triple sec and our house margarita blend.",
                        "10.00", "12.00", "14.00", OrderItem.BEVERAGE_CATEGORY, OrderItem.THREE_SIZES,"images/cartItem.png"),
                1,CartItem.SIZE_EXTRA_LARGE,"14.00"));
        listOfItems.add(new CartItem(
                new OrderItem("1001", "images/BBQ-Chicken-Flip-02.png", "BBQ-Chicken flip",
                "Juicy chicken with our BBQ sauce, cheddar cheese, onions, bell peppers, jalapeños, bacon & mozzarella cheese.",
                "10.00", "12.00", "14.00", OrderItem.SANDWICH_CATEGORY, OrderItem.SINGLE_SIZE,"images/cartItem.png"),
                2, CartItem.SIZE_ONLY, "20.00"));
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

    private double doubleFromString(String value) {
        return (Double.parseDouble(value));
    }
    public void addItem(String itemId, String size) {
        OrderItem orderItemToAdd = itemService.getItemById(itemId);
        if (orderItemToAdd !=null) {
            String itemSize = CartItem.SIZE_ONLY;
            String itemPrice = orderItemToAdd.getPriceSingleOrMedium();
            if (size.equals(CartItem.SIZE_MEDIUM)) {
                itemSize = CartItem.SIZE_MEDIUM;
                itemPrice = orderItemToAdd.getPriceSingleOrMedium();
            } else if (size.equals(CartItem.SIZE_LARGE)) {
                itemSize = CartItem.SIZE_LARGE;
                itemPrice = orderItemToAdd.getPriceLarge();
            } else if (size.equals(CartItem.SIZE_EXTRA_LARGE)) {
                itemSize = CartItem.SIZE_EXTRA_LARGE;
                itemPrice = orderItemToAdd.getPriceExtraLarge();
            }
            System.out.println("order item size = "+ itemSize);
            System.out.println("order item price = " + itemPrice);

            DecimalFormat df = new DecimalFormat("#.00");
            List<CartItem> cartItems = getItemById(itemId);
            CartItem cartItem = null;
            Iterator<CartItem> cartListIterator = cartItems.iterator();
            while (cartListIterator.hasNext()) {
                CartItem cartItemToCheck = cartListIterator.next();
                System.out.println("cart item size = "+cartItemToCheck.getSize());
                System.out.println("order item size = " + itemSize);
                if (cartItemToCheck.getSize().equals(itemSize)) {
                    cartItem = cartItemToCheck;
                    break;
                }
            }
            boolean updateExistingItem = cartItem != null;
            if (updateExistingItem) {
                System.out.println("changing number of items for " + orderItemToAdd + " to order");
                cartItem.setNumberOrdered(cartItem.getNumberOrdered() + 1);
                cartItem.setTotalPrice(df.format(
                        doubleFromString(itemPrice) *
                                cartItem.getNumberOrdered()));
            } else {
                System.out.println("adding new item " + itemId + " to order");
                cartItem = new CartItem(orderItemToAdd, 1,
                        itemSize, itemPrice);
            }

            cart.setTotalCost(df.format(doubleFromString(cart.getTotalCost()) +
                    doubleFromString(orderItemToAdd.getPriceSingleOrMedium())));
            if (!updateExistingItem) {
                cart.getItems().add(cartItem);
            }
        }
    }

    public List<CartItem> getItemById(String id) {

        Predicate<CartItem> byId = p -> p.getOrderItem().getId().equals(id);
        return filterItems(byId);
    }

    public List<CartItem> filterItems(Predicate<CartItem> strategy) {
        return getCart().getItems().stream().filter(strategy).collect(Collectors.toList());
    }

}