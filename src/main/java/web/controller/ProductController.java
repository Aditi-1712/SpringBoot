package web.controller;


import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import web.entity.Customer;
import web.entity.Orders;
import web.entity.Product;
import web.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/productView")
    public String viewTable(Model model) {
        model.addAttribute("data", productService.getAllProducts());
        model.addAttribute("columns", new String[]{"ID", "Name", "Price"});
        return "productView";
    }

}
