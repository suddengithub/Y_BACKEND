package com.kh.MINI.computer2.controller;

import com.kh.MINI.computer2.dao.PartDAO;
import com.kh.MINI.computer2.vo.PartVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OwnPCCustomizationController {

    @Autowired
    private PartDAO partDAO;

    @GetMapping("/parts/{partType}")
    public List<PartVO> getPartsByType(@PathVariable String partType) {
        return partDAO.getPartsByType(partType);
    }
}
