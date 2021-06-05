package com.group6.jBravo.models;

public class OrderItem {
    String id;
    String imageName;
    String name;
    String description;
    String priceSingleOrMedium;
    String priceLarge;
    String priceExtraLarge;
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

    public OrderItem(String id, String imageName, String name, String description, String priceSingleOrMedium,
                     String priceLarge, String priceExtraLarge, String category, String sizes, String cartImageName) {
        super();
        this.id = id;
        this.imageName = imageName;
        this.name = name;
        this.description = description;
        this.priceSingleOrMedium = priceSingleOrMedium;
        this.priceLarge = priceLarge;
        this.priceExtraLarge = priceExtraLarge;
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
    public String getPriceSingleOrMedium() {
        return priceSingleOrMedium;
    }
    public void setPriceSingleOrMedium(String priceSingleOrMedium) {
        this.priceSingleOrMedium = priceSingleOrMedium;
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

    public String getPriceLarge() {
        return priceLarge;
    }

    public void setPriceLarge(String priceLarge) {
        this.priceLarge = priceLarge;
    }

    public String getPriceExtraLarge() {
        return priceExtraLarge;
    }

    public void setPriceExtraLarge(String priceExtraLarge) {
        this.priceExtraLarge = priceExtraLarge;
    }
}
