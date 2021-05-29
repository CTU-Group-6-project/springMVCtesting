package com.group6.jBravo.models;

public class OrderItem {
    String id;
    String imageName;
    String name;
    String description;
    String price;
    String category;
    String sizes;
    String cartImageName;

    public final static String PIZZA_CATEGORY = "pizza";
    public final static String SANDWICH_CATEGORY = "sandwich";
    public final static String SALAD_CATEGORY = "salad";
    public final static String DESSERT_CATEGORY = "dessert";
    public final static String BEVERAGE_CATEGORY = "beverage";

    public final static String SINGLE_SIZE = "oneSize";
    public final static String THREE_SIZES = "threeSizes";

    public OrderItem(String id, String imageName, String name, String description, String price,
                     String category, String sizes, String cartImageName) {
        super();
        this.id = id;
        this.imageName = imageName;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.sizes = sizes;
        this.cartImageName = cartImageName;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getImageName() {
        return imageName;
    }
    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSizes() {
        return sizes;
    }

    public void setSizes(String sizes) {
        this.sizes = sizes;
    }

    public String getCartImageName() {
        return cartImageName;
    }

    public void setCartImageName(String cartImageName) {
        this.cartImageName = cartImageName;
    }
}
