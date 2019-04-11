package com.vilin.springmvc.chapter13.unit.stub;

import static org.junit.Assert.assertNotNull;

import com.vilin.springmvc.chapter13.unit.dao.ProductDAO;
import com.vilin.springmvc.chapter13.unit.service.ProductService;
import com.vilin.springmvc.chapter13.unit.service.ProductServiceImpl;
import org.junit.Test;

public class ProductServiceImplTest {

    @Test
    public void testCalculateDiscount() {
        ProductDAO productDAO = new ProductDAOStub();
        ProductService productService = new ProductServiceImpl(productDAO);
        assertNotNull(productService);
    }

}
