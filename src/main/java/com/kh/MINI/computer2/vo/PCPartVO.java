package com.kh.MINI.computer2.vo;

public class PCPartVO {
    private String category;
    private String name;
    private int price;
    private String image;

    public PCPartVO() {}

    public PCPartVO(String category, String name, int price, String image) {
        this.category = category;
        this.name = name;
        this.price = price;
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
