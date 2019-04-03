package com.vilin.springmvc.chapter04.controller;

import com.vilin.springmvc.chapter02.design01_02.Product;
import com.vilin.springmvc.chapter02.design01_02.ProductForm;
import com.vilin.springmvc.chapter04.service.ProductService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.math.BigDecimal;

@Controller
public class ProductController2 {
    private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/input-product")
    public String inputProduct(){
        logger.info("inputProduct called");
        return "ProductForm";
    }

    @RequestMapping(value = "/save-product")
    public String saveProduct(ProductForm productForm, RedirectAttributes redirectAttributes){
        logger.info("saveProduct called");

        Product product = new Product();
        product.setName(productForm.getName());
        product.setDescription(productForm.getDescription());
        product.setPrice(new BigDecimal(productForm.getPrice()));

        Product saveProduct = productService.add(product);

        redirectAttributes.addFlashAttribute("message", "The product was successfully added");
        return "redirect:/view-product/" + saveProduct.getId();
    }

    @RequestMapping(value = "/view-product/{id}")
    public String viewProduct(@PathVariable Long id, Model model){
        Product product = productService.get(id);
        model.addAttribute("product", product);
        return "ProductView";
    }
}
