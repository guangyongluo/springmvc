package com.vilin.springmvc.chapter04.service;


import com.vilin.springmvc.chapter02.design01_02.Product;

public interface ProductService {
    Product add(Product product);
    Product get(long id);
}
