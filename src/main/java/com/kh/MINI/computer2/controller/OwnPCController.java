package com.kh.MINI.computer2.controller;

import com.kh.MINI.computer2.vo.PCPartVO;
import com.kh.MINI.computer2.service.OwnPCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ownpc")
public class OwnPCController {

    @Autowired
    private OwnPCService ownPCService;

    @GetMapping("/parts/{category}")
    public List<PCPartVO> getPartsByCategory(@PathVariable String category) {
        return ownPCService.getPartsByCategory(category);
    }

    @PostMapping("/cart")
    public String addToCart(@RequestBody List<PCPartVO> selectedParts) {
        return ownPCService.addToCart(selectedParts);
    }

    @GetMapping("/cart")
    public List<PCPartVO> getCart() {
        return ownPCService.getCart();
    }

    @DeleteMapping("/cart/{index}")
    public String removeFromCart(@PathVariable int index) {
        return ownPCService.removeFromCart(index);
    }
}
