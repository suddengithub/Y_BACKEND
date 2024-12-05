package com.kh.MINI.computer2.dao;

import com.kh.MINI.computer2.vo.SuggestedPCVO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SuggestedPCDAOImpl implements SuggestedPCDAO {

    @Override
    public List<SuggestedPCVO> getPCsByPriceRange(String priceRange) {
        List<SuggestedPCVO> pcs = new ArrayList<>();

        // 예시 데이터: 가격대별 PC 추천 목록(가격대 별로 1개씩 배치)
        if (priceRange.equals("70만원 미만")) {
            pcs.add(new SuggestedPCVO("A", 600000, "CPU: Ryzen 5, RAM: 8GB, SSD: 256GB"));
            pcs.add(new SuggestedPCVO("B", 650000, "CPU: Ryzen 5, RAM: 16GB, SSD: 512GB"));
        } else if (priceRange.equals("70만원 이상 ~ 80만원 미만")) {
            pcs.add(new SuggestedPCVO("C", 750000, "CPU: Ryzen 7, RAM: 8GB, SSD: 512GB"));
        } else if (priceRange.equals("80만원 이상 ~ 90만원 미만")) {
            pcs.add(new SuggestedPCVO("D", 850000, "CPU: Ryzen 7, RAM: 16GB, SSD: 1TB"));
        } else if (priceRange.equals("90만원 이상 ~ 100만원 미만")) {
            pcs.add(new SuggestedPCVO("E", 950000, "CPU: RYZEN 7, RAM: 32GB, SSD: 2TB"));
        } else if (priceRange.equals("100만원 이상")) {
            pcs.add(new SuggestedPCVO("F", 1100000, "CPU: Ryzen 7, RAM: 64GB, SSD: 4TB"));
        }

        return pcs;
    }
}
