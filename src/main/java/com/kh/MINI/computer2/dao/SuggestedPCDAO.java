package com.kh.MINI.computer2.dao;

import com.kh.MINI.computer2.vo.SuggestedPCVO;
import java.util.List;

public interface SuggestedPCDAO {
    List<SuggestedPCVO> getPCsByPriceRange(String priceRange);
}
