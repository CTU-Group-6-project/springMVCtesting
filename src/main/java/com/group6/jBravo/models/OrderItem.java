package com.group6.jBravo.models;

public class OrderItem {
    String id;
    String imageName;
    String name;
    String description;
    String price;


    public OrderItem(String id, String imageName, String name, String description, String price) {
        super();
        this.id = id;
        this.imageName = imageName;
        this.name = name;
        this.description = description;
        this.price = price;
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

}
