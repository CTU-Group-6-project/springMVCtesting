package com.group6.jBravo.models;

import java.util.List;

public class Cart {

    public static final String ORDER_DELIVERY = "delivery";
    public static final String ORDER_PICKUP = "pickup";
    public static final String FIXED_DELIVERY_COST = "30.00";

    String couponCode;
    String deliveryMethod;
    String totalCost;
    String totalCostWithDelivery;
    String deliveryCost;

    List<CartItem> items;

    public Cart(String couponCode, String deliveryMethod, String totalCost, String totalCostWithDelivery, List<CartItem> items) {
        this.couponCode = couponCode;
        this.deliveryMethod = deliveryMethod;
        this.totalCost = totalCost;
        this.totalCostWithDelivery = totalCostWithDelivery;
        this.items = items;
        this.deliveryCost = FIXED_DELIVERY_COST;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public void setItems(List<CartItem> items) {
        this.items = items;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public String getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    public String getTotalCostWithDelivery() {
        return totalCostWithDelivery;
    }

    public void setTotalCostWithDelivery(String totalCostWithDelivery) {
        this.totalCostWithDelivery = totalCostWithDelivery;
    }

    public void setDeliveryCost(String deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

    public String getDeliveryCost() {
        return deliveryCost;
    }
}
