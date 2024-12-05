package com.kh.MINI.computer2.dao;

import com.kh.MINI.computer2.vo.PartVO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PartDAOImpl implements PartDAO {

    @Override
    public List<PartVO> getPartsByType(String partType) {
        List<PartVO> parts = new ArrayList<>();

        // 예시 데이터(항목당 6개씩 배치)
        if (partType.equals("CPU")) {
            parts.add(new PartVO("CPU", "RYZEN 5600G", 150000));
            parts.add(new PartVO("CPU", "RYZEN 5600X", 200000));
        } else if (partType.equals("Motherboard")) {
            parts.add(new PartVO("Motherboard", "MSI 550M", 120000));
            parts.add(new PartVO("Motherboard", "MSI B450", 100000));
        } else if (partType.equals("RAM")) {
            parts.add(new PartVO("RAM", "SAMSUNG 8GB", 50000));
            parts.add(new PartVO("RAM", "SAMSUNG 16GB", 100000));
        } else if (partType.equals("VGA")) {
            parts.add(new PartVO("VGA", "NVIDIA 1060GTX", 250000));
        } else if (partType.equals("SSD")) {
            parts.add(new PartVO("SSD", "EVO 512GB", 80000));
        } else if (partType.equals("HDD")) {
            parts.add(new PartVO("HDD", "WD 2TB", 60000));
        }

        return parts;
    }
}
