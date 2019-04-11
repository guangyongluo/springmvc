package com.vilin.springmvc.chapter13.unit.service;

import java.math.BigDecimal;

public interface ProductService {
    BigDecimal calculateDiscount();
    boolean isOnSale(int productId);

}
