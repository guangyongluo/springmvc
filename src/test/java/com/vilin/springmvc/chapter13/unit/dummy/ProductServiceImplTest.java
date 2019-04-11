package com.vilin.springmvc.chapter13.unit.dummy;

import static org.junit.Assert.assertNotNull;

import com.vilin.springmvc.chapter13.unit.dao.ProductDAO;
import com.vilin.springmvc.chapter13.unit.service.ProductService;
import com.vilin.springmvc.chapter13.unit.service.ProductServiceImpl;
import org.junit.Test;

public class ProductServiceImplTest {

    @Test
    public void testCalculateDiscount() {
        ProductDAO productDAO = new ProductDAODummy();
        ProductService productService = new ProductServiceImpl(productDAO);
        assertNotNull(productService);
    }

}
