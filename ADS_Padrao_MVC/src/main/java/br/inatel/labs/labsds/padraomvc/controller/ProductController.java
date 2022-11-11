package br.inatel.labs.labsds.padraomvc.controller;

import br.inatel.labs.labsds.padraomvc.model.Product;
import br.inatel.labs.labsds.padraomvc.model.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping("/product-list")
    public String getPage(Model model) {
        List<Product> productList = service.getProductList();
        model.addAttribute("productList", productList);
        return "product-list";
    }
}
