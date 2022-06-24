package com.example.vuquangdong.entity;

public class PhoneEntity {

    private int id;
    private String Name;
    private String Brand;
    private String Price;
    private String Description;
    public PhoneEntity() {
    }
    enum Brands {Apple, Samsung, Nokia, Others}
    public PhoneEntity(String name, String Brand, String Price, String Description) {
        this.Name = name;
        this.Brand = Brand;
        this.Price = Price;
        this.Description = Description;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }



}
