package com.kh.MINI.computer2.dao;

import com.kh.MINI.computer2.vo.SuggestedPCVO;
import java.util.List;

// 데이터베이스와 연결된 DAO 인터페이스
public interface SuggestedPCDAO {
    List<SuggestedPCVO> getPCsByPriceRange(String priceRange);
}
