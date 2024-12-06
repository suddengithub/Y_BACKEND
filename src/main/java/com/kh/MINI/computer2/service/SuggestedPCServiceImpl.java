package com.kh.MINI.computer2.service;

import com.kh.MINI.computer2.dao.SuggestedPCDAO;
import com.kh.MINI.computer2.vo.SuggestedPCVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuggestedPCServiceImpl implements SuggestedPCService {

    @Autowired
    private SuggestedPCDAO suggestedPCDAO;

    @Override
    public List<SuggestedPCVO> getPCsByPriceRange(String priceRange) {
        return suggestedPCDAO.getPCsByPriceRange(priceRange);
    }
}
