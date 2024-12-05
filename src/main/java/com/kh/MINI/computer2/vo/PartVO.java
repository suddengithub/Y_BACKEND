package com.kh.MINI.computer2.vo;

public class PartVO {
    private String partType;
    private String partName;
    private double price;

    public PartVO(String partType, String partName, double price) {
        this.partType = partType;
        this.partName = partName;
        this.price = price;
    }

    public String getPartType() {
        return partType;
    }

    public void setPartType(String partType) {
        this.partType = partType;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
