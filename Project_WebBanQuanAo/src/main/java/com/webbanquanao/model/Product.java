package com.webbanquanao.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String image;
    private String name;
    private float price;
    private String des;
    private Category category;

    public Product()
    {
        super();
    }

    public Product(int id, String image, String name, float price, String des, Category category) {
        super();
        this.id = id;
        this.image = image;
        this.name = name;
        this.price = price;
        this.des = des;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
