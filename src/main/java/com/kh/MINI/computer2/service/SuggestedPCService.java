package com.kh.MINI.computer2.service;

import com.kh.MINI.computer2.vo.SuggestedPCVO;
import java.util.List;

// 비즈니스 로직을 정의하는 Service 인터페이스
public interface SuggestedPCService {
    List<SuggestedPCVO> getPCsByPriceRange(String priceRange);
}
