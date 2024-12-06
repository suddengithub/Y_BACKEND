package com.kh.MINI.computer2.dao;

import com.kh.MINI.computer2.vo.OwnPCVO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OwnPCDAO {
    private final List<List<OwnPCVO>> cart = new ArrayList<>(); // 장바구니 (다중 구성)

    // 부품 더미 데이터
    private static final List<OwnPCVO> cpuList = List.of(
            new OwnPCVO("cpu", "RYZEN 5600", 129000, "/images/cpu1.jpg", 1),
            new OwnPCVO("cpu", "RYZEN 5600G", 169000, "/images/cpu2.jpg", 1),
            new OwnPCVO("cpu", "RYZEN 5600X", 179000, "/images/cpu3.jpg", 1),
            new OwnPCVO("cpu", "RYZEN 7600", 242000, "/images/cpu4.jpg", 1),
            new OwnPCVO("cpu", "RYZEN 5700G", 265000, "/images/cpu5.jpg", 1),
            new OwnPCVO("cpu", "RYZEN 5800XT", 384000, "/images/cpu6.jpg", 1)
    );

    private static final List<OwnPCVO> motherboardList = List.of(
            new OwnPCVO("motherboard", "GIGABYTE A520M", 64000, "/images/motherboard1.jpg", 1),
            new OwnPCVO("motherboard", "GIGABYTE B550M", 126000, "/images/motherboard2.jpg", 1),
            new OwnPCVO("motherboard", "GIGABYTE B650M", 154000, "/images/motherboard3.jpg", 1),
            new OwnPCVO("motherboard", "GIGABYTE A620M", 174000, "/images/motherboard4.jpg", 1),
            new OwnPCVO("motherboard", "GIGABYTE X570", 237000, "/images/motherboard5.jpg", 1),
            new OwnPCVO("motherboard", "GIGABYTE X670", 377000, "/images/motherboard6.jpg", 1)
    );

    private static final List<OwnPCVO> ramList = List.of(
            new OwnPCVO("ram", "SAMSUNG DDR4 PC4-21300 8GB", 18000, "/images/ram1.jpg", 1),
            new OwnPCVO("ram", "SAMSUNG DDR4 PC4-25600 4GB", 19000, "/images/ram2.jpg", 1),
            new OwnPCVO("ram", "SAMSUNG DDR4 PC4-25600 8GB", 21000, "/images/ram3.jpg", 1),
            new OwnPCVO("ram", "SAMSUNG DDR5 PC5-44800 8GB", 38000, "/images/ram4.jpg", 1),
            new OwnPCVO("ram", "SAMSUNG DDR4 PC4-21300 서버용 32GB", 63000, "/images/ram5.jpg", 1),
            new OwnPCVO("ram", "SAMSUNG DDR5 PC5-38400 16GB", 77000, "/images/ram6.jpg", 1)
    );

    private static final List<OwnPCVO> vgaList = List.of(
            new OwnPCVO("vga", "GeForce RTX 4060 WINDFORCE OC D6 8GB", 425000, "/images/vga1.jpg", 1),
            new OwnPCVO("vga", "GeForce RTX 4060 Ti WINDFORCE OC D6 8GB", 579000, "/images/vga2.jpg", 1),
            new OwnPCVO("vga", "GeForce RTX 4070 SUPER Gaming OC D6X 12GB", 1029000, "/images/vga3.jpg", 1),
            new OwnPCVO("vga", "GeForce RTX 4070 Ti SUPER WINDFORCE OC D6X 16GB", 1250000, "/images/vga4.jpg", 1),
            new OwnPCVO("vga", "GeForce RTX 4080 SUPER AERO OC D6X 16GB", 1749000, "/images/vga5.jpg", 1),
            new OwnPCVO("vga", "GeForce RTX 4090 Gaming OC D6X 24GB", 3450000, "/images/vga6.jpg", 1)
    );

    private static final List<OwnPCVO> ssdList = List.of(
            new OwnPCVO("ssd", "870 EVO SATA 250GB", 73000, "/images/ssd1.jpg", 1),
            new OwnPCVO("ssd", "980 M.2 NVMe 2280 250GB", 78000, "/images/ssd2.jpg", 1),
            new OwnPCVO("ssd", "970 EVO Plus M.2 NVMe 2280 250GB", 81500, "/images/ssd3.jpg", 1),
            new OwnPCVO("ssd", "870 QVO SATA 1TB", 162500, "/images/ssd4.jpg", 1),
            new OwnPCVO("ssd", "980 PRO M.2 NVMe 2280 1TB", 208000, "/images/ssd5.jpg", 1),
            new OwnPCVO("ssd", "990 PRO M.2 NVMe 2280 1TB", 218000, "/images/ssd6.jpg", 1)
    );

    private static final List<OwnPCVO> hddList = List.of(
            new OwnPCVO("hdd", "Western Digital BLUE HDD 1TB", 81000, "/images/hdd1.jpg", 1),
            new OwnPCVO("hdd", "Western Digital MOBILE BLUE HDD 2TB", 125000, "/images/hdd2.jpg", 1),
            new OwnPCVO("hdd", "Western Digital RED PLUS HDD 3TB", 135000, "/images/hdd3.jpg", 1),
            new OwnPCVO("hdd", "Western Digital RED PRO HDD 2TB", 169000, "/images/hdd4.jpg", 1),
            new OwnPCVO("hdd", "Western Digital Ultrastar HDD 20TB", 749000, "/images/hdd5.jpg", 1),
            new OwnPCVO("hdd", "Western Digital Ultrastar HDD 24TB", 909000, "/images/hdd6.jpg", 1)
    );

    public List<OwnPCVO> getPartsByCategory(String category) {
        switch (category.toLowerCase()) {
            case "cpu":
                return cpuList;
            case "motherboard":
                return motherboardList;
            case "ram":
                return ramList;
            case "vga":
                return vgaList;
            case "ssd":
                return ssdList;
            case "hdd":
                return hddList;
            default:
                return new ArrayList<>();
        }
    }

    public void addToCart(List<OwnPCVO> selectedParts) {
        cart.add(new ArrayList<>(selectedParts)); // 복사본 추가
    }

    public List<List<OwnPCVO>> getCart() {
        return cart;
    }

    public void removeFromCart(int index) {
        if (index >= 0 && index < cart.size()) {
            cart.remove(index);
        }
    }
}
