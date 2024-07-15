package web.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import web.entity.Product;
import web.entity.Shipping;
import web.service.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ShippingController {

    @Autowired
    private ShippingService shippingService;

    @GetMapping("/shippingView")
    public String viewTable(Model model) {
        model.addAttribute("data", shippingService.getAllShippings());
        model.addAttribute("columns", new String[]{"ID", "Method", "Days to Ship"});
        return "shippingView";
    }

}
