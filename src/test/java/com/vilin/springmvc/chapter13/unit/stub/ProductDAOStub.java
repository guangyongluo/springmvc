package com.vilin.springmvc.chapter13.unit.stub;

import com.vilin.springmvc.chapter13.unit.dao.ProductDAO;

import java.math.BigDecimal;

public class ProductDAOStub implements ProductDAO {
    public BigDecimal calculateDiscount() {
        return new BigDecimal(14);
    }
    public boolean isOnSale(int productId) {
        return false;
    };
}
