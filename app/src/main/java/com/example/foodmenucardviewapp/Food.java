package com.example.foodmenucardviewapp;

public class Food {

    int image;
    String name, desc, price;

    public Food(int image, String name, String desc, String price) {
        this.image = image;
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public String getPrice() {
        return price;
    }
}