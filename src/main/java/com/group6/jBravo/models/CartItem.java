package com.group6.jBravo.models;

public class CartItem {

    public static final String SIZE_ONLY = "oneSize";
    public static final String SIZE_MEDIUM = "mediumSize";
    public static final String SIZE_LARGE = "largeSize";
    public static final String SIZE_EXTRA_LARGE = "extraLargeSize";

    OrderItem orderItem;
    int numberOrdered;
    String size;
    String totalPrice;

    public CartItem(OrderItem orderItem, int numberOrdered, String size, String totalPrice) {
        this.orderItem = orderItem;
        this.numberOrdered = numberOrdered;
        this.size = size;
        this.totalPrice = totalPrice;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public int getNumberOrdered() {
        return numberOrdered;
    }

    public void setNumberOrdered(int numberOrdered) {
        this.numberOrdered = numberOrdered;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }
}
