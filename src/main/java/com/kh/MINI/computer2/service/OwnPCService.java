package com.kh.MINI.computer2.service;

import com.kh.MINI.computer2.vo.PCPartVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OwnPCService {

    private final List<PCPartVO> parts = new ArrayList<>();
    private final List<List<PCPartVO>> cart = new ArrayList<>();

    public OwnPCService() {
        initializeParts();
    }

    private void initializeParts() {
        parts.add(new PCPartVO("cpu", "RYZEN 5600", 129000, "/images/cpu1.jpg"));
        parts.add(new PCPartVO("cpu", "RYZEN 5600G", 169000, "/images/cpu2.jpg"));
        // Initialize all other parts here (like "motherboard", "ram", etc.)
    }

    public List<PCPartVO> getPartsByCategory(String category) {
        return parts.stream()
                .filter(part -> part.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    public String addToCart(List<PCPartVO> selectedParts) {
        cart.add(selectedParts);
        return "Parts added to cart successfully!";
    }

    public List<PCPartVO> getCart() {
        return cart.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

    public String removeFromCart(int index) {
        if (index < cart.size()) {
            cart.remove(index);
            return "Part removed from cart successfully!";
        }
        return "Invalid index!";
    }
}
