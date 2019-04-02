package com.vilin.springmvc.chapter04;

import com.vilin.springmvc.chapter01.Product;
import com.vilin.springmvc.chapter02.design01_02.ProductForm;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;

@Controller
public class ProductController {
    private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    @RequestMapping(value = "/input-product")
    public String inputProduct(){
        logger.info("inputProduct called");
        return "ProductForm";
    }

    @RequestMapping(value = "save-product")
    public String saveProduct(ProductForm productForm, Model model){
        logger.info("saveProduct called");

        Product product = new Product();
        product.setName(productForm.getName());
        product.setDescription(productForm.getDescription());
        product.setPrice(new Float(productForm.getPrice()));
        model.addAttribute("product", product);
        return "ProductDetails";
    }
}
