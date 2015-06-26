package com.example.nick.myapplication;


public class Shop {

    private String name;
    private int discount;
    private int imageId;

    public Shop() {
    }

    public Shop(String name, int discount, int imageId) {
        this.name = name;
        this.discount = discount;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
