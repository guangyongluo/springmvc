package com.vilin.springmvc.chapter03;


import com.vilin.springmvc.chapter01.Product;
import com.vilin.springmvc.chapter02.design01_02.ProductForm;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaveProductController implements Controller {
    private static final Logger logger = LogManager.getLogger(SaveProductController.class);

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        logger.info("SaveProductController called");
        ProductForm productForm = new ProductForm();

        productForm.setName(httpServletRequest.getParameter("name"));
        productForm.setDescription(httpServletRequest.getParameter("description"));
        productForm.setPrice(httpServletRequest.getParameter("price"));

        Product product = new Product();
        product.setName(productForm.getName());
        product.setDescription(productForm.getDescription());

        product.setPrice(Float.parseFloat(productForm.getPrice()));

        //return new ModelAndView("/jsp/chapter03/intro1/ProductDetails.jsp", "product", product);

        return new ModelAndView("ProductDetails", "product", product);
    }
}
