package com.kh.MINI.computer2.dao;

import com.kh.MINI.computer2.vo.SuggestedPCVO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SuggestedPCDAOImpl implements SuggestedPCDAO {

    // 가격대별 추천 PC 데이터를 반환하는 메서드
    @Override
    public List<SuggestedPCVO> getPCsByPriceRange(String priceRange) {
        List<SuggestedPCVO> pcs = new ArrayList<>();

        switch (priceRange) {
            case "70만원 미만":
                pcs.add(new SuggestedPCVO(1, "PC1", 408000, "RYZEN 5500GT", "ASUS Z390", "8GB", "없음", "256GB", "2TB", "https://image3.compuzone.co.kr/img/product_img/2024/0513/1144237/1144237_600.jpg"));
                pcs.add(new SuggestedPCVO(2, "PC2", 359000, "RYZEN 5500GT", "MSI B450", "8GB", "없음", "128GB", "1TB", "https://image3.compuzone.co.kr/img/product_img/2024/0705/1158906/1158906_600.jpg"));
                pcs.add(new SuggestedPCVO(3, "PC3", 431000, "RYZEN 3200G", "Gigabyte B360M", "16GB", "없음", "500GB", "1TB", "https://image3.compuzone.co.kr/img/product_img/2024/0717/1161488/1161488_600.jpg"));
                pcs.add(new SuggestedPCVO(4, "PC4", 384000, "RYZEN 8500G", "ASUS H310M", "8GB", "없음", "480GB", "1TB", "https://image3.compuzone.co.kr/img/product_img/2024/1029/1185458/1185458_600.jpg"));
                break;

            case "70만원 이상 ~ 80만원 미만":
                pcs.add(new SuggestedPCVO(5, "PC5", 757000, "RYZEN 5600", "MSI Z390", "16GB", "GeForce RTX 3060", "500GB", "1TB", "https://image3.compuzone.co.kr/img/product_img/2024/0523/1146825/1146825_600.jpg"));
                pcs.add(new SuggestedPCVO(6, "PC6", 780000, "RYZEN 5600", "Gigabyte B450M", "16GB", "Radeon RX 7600", "500GB", "1TB", "https://image3.compuzone.co.kr/img/product_img/2024/0705/1158769/1158769_600.jpg"));
                pcs.add(new SuggestedPCVO(7, "PC7", 704000, "RYZEN 5600", "ASUS Z390", "16GB", "Radeon RX 6600", "512GB", "1TB", "https://image3.compuzone.co.kr/img/product_img/2024/1011/1180372/1180372_600.jpg"));
                pcs.add(new SuggestedPCVO(8, "PC8", 800000, "RYZEN 7600", "MSI B550", "16GB", "GeForce GTX 1660 Ti", "1TB", "1TB", "https://image3.compuzone.co.kr/img/product_img/2024/1015/1181529/1181529_600.jpg"));
                break;

            case "80만원 이상 ~ 90만원 미만":
                pcs.add(new SuggestedPCVO(9, "PC9", 850000, "RYZEN 5600", "Gigabyte Z490", "16GB", "GeForce RTX 4060", "1TB", "1TB", "https://image3.compuzone.co.kr/img/product_img/2024/0312/1123409/1123409_600.jpg"));
                pcs.add(new SuggestedPCVO(10, "PC10", 880000, "RYZEN 5600", "ASUS B550", "16GB", "GeForce RTX 4060", "1TB", "2TB", "https://image3.compuzone.co.kr/img/product_img/2024/0329/1129428/1129428_600.jpg"));
                pcs.add(new SuggestedPCVO(11, "PC11", 890000, "RYZEN 5600", "MSI Z590", "16GB", "GeForce RTX 4060", "1TB", "2TB", "https://image3.compuzone.co.kr/img/product_img/2024/0705/1158765/1158765_600.jpg"));
                pcs.add(new SuggestedPCVO(12, "PC12", 900000, "RYZEN 5600", "Gigabyte X570", "32GB", "GeForce RTX 4060", "1TB", "2TB", "https://image3.compuzone.co.kr/img/product_img/2024/0509/1142768/1142768_600.jpg"));
                break;

            case "90만원 이상 ~ 100만원 미만":
                pcs.add(new SuggestedPCVO(13, "PC13", 950000, "RYZEN 5600", "ASUS ROG", "32GB", "GeForce RTX 4060", "1TB", "2TB", "https://image3.compuzone.co.kr/img/product_img/2024/0819/1170004/1170004_600.jpg"));
                pcs.add(new SuggestedPCVO(14, "PC14", 980000, "RYZEN 5600", "MSI X570", "32GB", "GeForce RTX 4060", "1TB", "2TB", "https://image3.compuzone.co.kr/img/product_img/2024/0731/1164901/1164901_600.jpg"));
                pcs.add(new SuggestedPCVO(15, "PC15", 990000, "RYZEN 5600", "Gigabyte Z590", "32GB", "GeForce RTX 4060 Ti", "1TB", "2TB", "https://image3.compuzone.co.kr/img/product_img/2024/0326/1127739/1127739_600.jpg"));
                pcs.add(new SuggestedPCVO(16, "PC16", 987000, "RYZEN 8700G", "ASUS ROG Crosshair", "64GB", "없음", "1TB", "2TB", "https://image3.compuzone.co.kr/img/product_img/2024/0312/1123545/1123545_600.jpg"));
                break;

            case "100만원 이상":
                pcs.add(new SuggestedPCVO(17, "PC17", 1907000, "RYZEN 9800X3D", "ASUS Z590", "64GB", "Radeon RX 7700XT", "2TB", "2TB", "https://image3.compuzone.co.kr/img/product_img/2024/1106/1187771/1187771_600.jpg"));
                pcs.add(new SuggestedPCVO(18, "PC18", 1869000, "RYZEN 9800X3D", "MSI MEG X570", "64GB", "Radeon RX 7700XT", "2TB", "2TB", "https://image3.compuzone.co.kr/img/product_img/2024/1106/1187775/1187775_600.jpg"));
                pcs.add(new SuggestedPCVO(19, "PC19", 2196000, "RYZEN 9600X", "Gigabyte Z590", "64GB", "GeForce RTX 4070", "2TB", "2TB", "https://image3.compuzone.co.kr/img/product_img/2024/1008/1179436/1179436_600.jpg"));
                pcs.add(new SuggestedPCVO(20, "PC20", 2439000, "RYZEN 7800X3D", "ASUS ROG Crosshair", "64GB", "GeForce RTX 4070", "2TB", "2TB", "https://image3.compuzone.co.kr/img/product_img/2024/1203/1194029/1194029_600.jpg"));
                break;

            default:
                // 잘못된 범위일 경우 빈 리스트 반환
                break;
        }

        return pcs;
    }
}
