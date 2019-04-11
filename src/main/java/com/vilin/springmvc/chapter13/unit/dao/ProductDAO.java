package com.vilin.springmvc.chapter13.unit.dao;

import java.math.BigDecimal;

public interface ProductDAO {
    BigDecimal calculateDiscount();
    boolean isOnSale(int productId);
}
