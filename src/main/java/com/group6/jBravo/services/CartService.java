package com.group6.jBravo.services;

import com.group6.jBravo.models.Cart;
import com.group6.jBravo.models.CartItem;
import com.group6.jBravo.models.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class CartService {

    public static final Double FIXED_DELIVERY_COST = 30.00;

    @Autowired
    private ItemService itemService;

    Map<String,Cart> carts;

    private  DecimalFormat df = new DecimalFormat("#.00");


    public CartService() {
        carts = new HashMap<String, Cart>();
        carts.put("", createEmptyCart());
//        populateCartForTesting();
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
//        cart.setItems(listOfItems);
//        cart.setTotalCost("30.00");
//        cart.setDeliveryMethod(Cart.ORDER_DELIVERY);
//        cart.setTotalCostWithDelivery("35.00");
    }

    private Cart createEmptyCart() {
        return new Cart("",Cart.ORDER_PICKUP, "0.00","0.00", new ArrayList<CartItem>());
    }

    public Cart getCart() {
        String username = getCartBasedOnUser();
        return carts.get(username);
    }

    private String getCartBasedOnUser() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        String username;
        if (principal instanceof UserDetails) {
            username = ((UserDetails)principal).getUsername();
        } else {
            username = principal.toString();
        }
        System.out.println("logged into "+ username);
        if (!carts.containsKey(username)) {
            carts.put(username, createEmptyCart());
        }
        return username;
    }

    private double doubleFromString(String value) {
        return (Double.parseDouble(value));
    }

    public void addItem(String itemId, String size) {
        OrderItem orderItemToAdd = itemService.getItemById(itemId);
        if (orderItemToAdd !=null) {
            String itemSize = validateSizeSelection(size);
            String itemPrice = getPriceFromSize(orderItemToAdd, itemSize);
            System.out.println("order item size = "+ itemSize);
            System.out.println("order item price = " + itemPrice);

            CartItem cartItem = getCartItemReference(itemId, itemSize);
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
            adjustTotalPriceInCart(itemPrice, true);
            if (!updateExistingItem) {
                String username = getCartBasedOnUser();
                Cart cart =  carts.get(username);
                cart.getItems().add(cartItem);
            }
        }
    }

    private CartItem getCartItemReference(String itemId, String itemSize) {
        List<CartItem> cartItems = getItemById(itemId);
        CartItem cartItem = null;
        Iterator<CartItem> cartListIterator = cartItems.iterator();
        while (cartListIterator.hasNext()) {
            CartItem cartItemToCheck = cartListIterator.next();
            System.out.println("cart item size = " + cartItemToCheck.getSize());
            System.out.println("order item size = " + itemSize);
            if (cartItemToCheck.getSize().equals(itemSize)) {
                cartItem = cartItemToCheck;
                break;
            }
        }
        return cartItem;
    }

    private String getPriceFromSize(OrderItem orderItemToAdd, String itemSize) {
        String itemPrice = orderItemToAdd.getPriceSingleOrMedium();
        if (itemSize.equals(CartItem.SIZE_MEDIUM)) {
            itemPrice = orderItemToAdd.getPriceSingleOrMedium();
        } else if (itemSize.equals(CartItem.SIZE_LARGE)) {
            itemPrice = orderItemToAdd.getPriceLarge();
        } else if (itemSize.equals(CartItem.SIZE_EXTRA_LARGE)) {
            itemPrice = orderItemToAdd.getPriceExtraLarge();
        }
        return itemPrice;
    }

    private String validateSizeSelection(String size) {
        String itemSize = CartItem.SIZE_ONLY;
        if (size.equals(CartItem.SIZE_MEDIUM)) {
            itemSize = CartItem.SIZE_MEDIUM;
        } else if (size.equals(CartItem.SIZE_LARGE)) {
            itemSize = CartItem.SIZE_LARGE;
        } else if (size.equals(CartItem.SIZE_EXTRA_LARGE)) {
            itemSize = CartItem.SIZE_EXTRA_LARGE;
        }
        return itemSize;
    }

    public void deleteItem(String itemId, String size) {
        OrderItem orderItemToRemove = itemService.getItemById(itemId);
        if (orderItemToRemove !=null) {
            String itemSize = validateSizeSelection(size);
            String itemPrice = getPriceFromSize(orderItemToRemove, itemSize);
            System.out.println("order item size = "+ itemSize);
            System.out.println("order item price = " + itemPrice);

            CartItem cartItem = getCartItemReference(itemId, itemSize);
            if (cartItem !=null) {
                getCart().getItems().remove(cartItem);

                adjustTotalPriceInCart(itemPrice, false);
            }
        }
    }

    private void adjustTotalPriceInCart(String itemPrice, boolean add) {
        String username = getCartBasedOnUser();
        Cart cart =  carts.get(username);
        double newTotal;
        double newTotalWithDelivery;
        if (add) {
            newTotal = doubleFromString(cart.getTotalCost()) +
                    doubleFromString(itemPrice);
        } else {
            newTotal = doubleFromString(cart.getTotalCost()) -
                    doubleFromString(itemPrice);
        }
        newTotalWithDelivery = newTotal;
        if (cart.getDeliveryMethod() == Cart.ORDER_DELIVERY) {
            newTotalWithDelivery = newTotal + FIXED_DELIVERY_COST;
        }
        cart.setTotalCostWithDelivery(df.format(newTotalWithDelivery));
        cart.setTotalCost(df.format(newTotal));
    }

    public void incrementItem(String itemId, String size) {
        OrderItem orderItemToAdd = itemService.getItemById(itemId);
        if (orderItemToAdd !=null) {
            String itemSize = validateSizeSelection(size);
            String itemPrice = getPriceFromSize(orderItemToAdd, itemSize);
            System.out.println("order item size = "+ itemSize);
            System.out.println("order item price = " + itemPrice);

            CartItem cartItem = getCartItemReference(itemId, itemSize);
            if (cartItem != null) {
                System.out.println("incrementing number of items for " + orderItemToAdd + " to order");
                cartItem.setNumberOrdered(cartItem.getNumberOrdered() + 1);
                cartItem.setTotalPrice(df.format(
                        doubleFromString(itemPrice) *
                                cartItem.getNumberOrdered()));

                String username = getCartBasedOnUser();
                Cart cart =  carts.get(username);
                cart.setTotalCost(df.format(doubleFromString(cart.getTotalCost()) +
                        doubleFromString(itemPrice)));
            }
        }
    }

    public void decrementItem(String itemId, String size) {
        OrderItem orderItemToAdd = itemService.getItemById(itemId);
        if (orderItemToAdd !=null) {
            String itemSize = validateSizeSelection(size);
            String itemPrice = getPriceFromSize(orderItemToAdd, itemSize);
            System.out.println("order item size = "+ itemSize);
            System.out.println("order item price = " + itemPrice);

            CartItem cartItem = getCartItemReference(itemId, itemSize);
            if (cartItem != null) {
                System.out.println("decrementing number of items for " + orderItemToAdd + " to order");
                cartItem.setNumberOrdered(cartItem.getNumberOrdered() - 1);
                if (cartItem.getNumberOrdered() < 1) {
                    getCart().getItems().remove(cartItem);
                } else {
                    cartItem.setTotalPrice(df.format(
                            doubleFromString(itemPrice) *
                                    cartItem.getNumberOrdered()));
                }
                adjustTotalPriceInCart(itemPrice, false);
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