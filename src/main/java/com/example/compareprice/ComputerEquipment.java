package com.example.compareprice;


import java.util.Random;

public class ComputerEquipment {

    private int price;

    private String name;

    private String companyName;

    public ComputerEquipment(int price, String name, String companyName) {
        this.price = price;
        this.name = name;
        this.companyName = companyName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
