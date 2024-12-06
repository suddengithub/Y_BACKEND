package com.kh.MINI.computer2.vo;

public class OwnPCVO {
    private String category; // 부품 카테고리
    private String name;     // 부품 이름
    private int price;       // 가격
    private String image;    // 이미지 경로
    private int quantity;    // 수량

    public OwnPCVO(String cpu, String s, int i, String s1, int i1) {
    }

    // Getters and Setters
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
