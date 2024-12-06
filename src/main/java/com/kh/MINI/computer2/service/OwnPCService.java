package com.kh.MINI.computer2.service;

import com.kh.MINI.computer2.dao.OwnPCDAO;
import com.kh.MINI.computer2.vo.OwnPCVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnPCService {

    @Autowired
    private OwnPCDAO ownPCDAO;

    public List<OwnPCVO> getPartsByCategory(String category) {
        return ownPCDAO.getPartsByCategory(category);
    }

    public void addToCart(List<OwnPCVO> selectedParts) {
        ownPCDAO.addToCart(selectedParts);
    }

    public List<List<OwnPCVO>> getCart() {
        return ownPCDAO.getCart();
    }

    public void removeFromCart(int index) {
        ownPCDAO.removeFromCart(index);
    }
}
