package com.kh.MINI.computer2.dao;

import com.kh.MINI.computer2.vo.PCPartVO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OwnPCDAO {
    private final List<PCPartVO> parts = new ArrayList<>();
    private final List<List<PCPartVO>> cart = new ArrayList<>();

    public OwnPCDAO() {
        initializeParts();
    }

    private void initializeParts() {
        parts.add(new PCPartVO("cpu", "RYZEN 5600", 129000, "/images/cpu1.jpg"));
        parts.add(new PCPartVO("cpu", "RYZEN 5600G", 169000, "/images/cpu2.jpg"));
        // Add other parts initialization here...
    }

    public List<PCPartVO> getPartsByCategory(String category) {
        List<PCPartVO> result = new ArrayList<>();
        for (PCPartVO part : parts) {
            if (part.getCategory().equalsIgnoreCase(category)) {
                result.add(part);
            }
        }
        return result;
    }

    public void addToCart(List<PCPartVO> selectedParts) {
        cart.add(selectedParts);
    }

    public List<List<PCPartVO>> getCart() {
        return cart;
    }

    public void removeFromCart(int index) {
        if (index < cart.size()) {
            cart.remove(index);
        }
    }
}
