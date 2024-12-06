package com.kh.MINI.computer2.vo;

// 추천 PC 정보를 저장하는 VO 클래스
public class SuggestedPCVO {
    private int id;
    private String name;
    private int price;
    private String cpu;
    private String motherboard;
    private String ram;
    private String vga;
    private String ssd;
    private String hdd;
    private String image;

    // 기본 생성자
    public SuggestedPCVO() {}

    // 모든 필드를 포함하는 생성자
    public SuggestedPCVO(int id, String name, int price, String cpu, String motherboard, String ram, String vga, String ssd, String hdd, String image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.cpu = cpu;
        this.motherboard = motherboard;
        this.ram = ram;
        this.vga = vga;
        this.ssd = ssd;
        this.hdd = hdd;
        this.image = image;
    }

    // Getter와 Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getVga() {
        return vga;
    }

    public void setVga(String vga) {
        this.vga = vga;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
