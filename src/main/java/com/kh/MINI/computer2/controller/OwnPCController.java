package com.kh.MINI.computer2.controller;

import com.kh.MINI.computer2.service.OwnPCService;
import com.kh.MINI.computer2.vo.OwnPCVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ownpc")
public class OwnPCController {

    @Autowired
    private OwnPCService ownPCService;

    // 부품 목록 조회
    @GetMapping("/parts/{category}")
    public List<OwnPCVO> getPartsByCategory(@PathVariable String category) {
        return ownPCService.getPartsByCategory(category);
    }

    // 장바구니에 추가
    @PostMapping("/cart")
    public String addToCart(@RequestBody List<OwnPCVO> selectedParts) {
        ownPCService.addToCart(selectedParts);
        return "선택한 구성이 장바구니에 추가되었습니다.";
    }

    // 장바구니 조회
    @GetMapping("/cart")
    public List<List<OwnPCVO>> getCart() {
        return ownPCService.getCart();
    }

    // 장바구니에서 항목 제거
    @DeleteMapping("/cart/{index}")
    public String removeFromCart(@PathVariable int index) {
        ownPCService.removeFromCart(index);
        return "장바구니에서 항목이 삭제되었습니다.";
    }
}
