package com.kh.MINI.computer2.controller;

import com.kh.MINI.computer2.service.SuggestedPCService;
import com.kh.MINI.computer2.vo.SuggestedPCVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/suggestedPC")
public class SuggestedPCController {

    @Autowired
    private SuggestedPCService suggestedPCService;

    // 가격대별 추천 PC 목록을 가져오는 API
    @GetMapping("/list")
    public List<SuggestedPCVO> getPCsByPriceRange(@RequestParam String priceRange) {
        return suggestedPCService.getPCsByPriceRange(priceRange);
    }
}
