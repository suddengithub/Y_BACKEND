package com.kh.MINI.computer2.dao;

import com.kh.MINI.computer2.vo.PartVO;
import java.util.List;

public interface PartDAO {
    List<PartVO> getPartsByType(String partType);
}
