package com.vilin.springmvc.chapter13.unit.dummy;

import com.vilin.springmvc.chapter13.unit.dao.ProductDAO;

import java.math.BigDecimal;

public class ProductDAODummy implements ProductDAO {
    public BigDecimal calculateDiscount() {
        return null;
    }
    public boolean isOnSale(int productId) {
        return false;
    };
}
