package com.kh.MINI.computer2.controller;

import com.kh.MINI.computer2.dao.SuggestedPCDAO;
import com.kh.MINI.computer2.vo.SuggestedPCVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SuggestedPCController {

    @Autowired
    private SuggestedPCDAO suggestedPCDAO;

    @GetMapping("/pcs/{priceRange}")
    public List<SuggestedPCVO> getPCsByPriceRange(@PathVariable String priceRange) {
        return suggestedPCDAO.getPCsByPriceRange(priceRange);
    }
}
