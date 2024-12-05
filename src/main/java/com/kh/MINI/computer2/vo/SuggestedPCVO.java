package com.kh.MINI.computer2.vo;

public class SuggestedPCVO {
    private String name;
    private double price;
    private String specs;

    public SuggestedPCVO(String name, double price, String specs) {
        this.name = name;
        this.price = price;
        this.specs = specs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }
}
