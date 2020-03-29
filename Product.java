package com.company;

public class Product {
    private String name;
    private double price;
    private int code;
    private int numberOfProducts;

    public Product() {
        this.name = null;
        this.price = 0;
        this.code = 0;
        this.numberOfProducts = 0;
    }

    public Product(String name,double price, int code, int numberOfProducts) {
        this.name = name;
        this.price = price;
        this.code = code;
        this.numberOfProducts = numberOfProducts;
        if (numberOfProducts < 0) {
            System.out.println("Amount cannot be smaller than 0");
        }
        else {
            this.numberOfProducts = numberOfProducts;
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCode() {
        return code;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
