package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import web.entity.Product;
import web.service.ProductService;

@Controller
public class addProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private web.service.addProductService addProductService;

    @GetMapping("addProduct")
    public String addProduct(Model model) {

        model.addAttribute("product", new Product());
        return "addOrder";
    }

    @PostMapping("/addProduct")
    public String addCustomer(@ModelAttribute Product product, Model model) {
        addProductService.addProduct(product);
        model.addAttribute("data", productService.getAllProducts());
        model.addAttribute("columns", new String[]{"id", "name", "price"});
        return "addProduct";
    }
}
