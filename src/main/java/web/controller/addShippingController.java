package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import web.entity.Shipping;
import web.service.ShippingService;

@Controller
public class addShippingController {

    @Autowired
    private ShippingService shippingService;
    @Autowired
    private web.service.addShippingService addShippingService;

    @GetMapping("addShipping")
    public String addProduct(Model model) {

        model.addAttribute("shipping", new Shipping());
        return "addShipping";
    }

    @PostMapping("/addShipping")
    public String addCustomer(@ModelAttribute Shipping shipping, Model model) {
        addShippingService.addShipping(shipping);
        model.addAttribute("data", shippingService.getAllShippings());
        model.addAttribute("columns", new String[]{"id", "method", "daysToShip"});
        return "addShipping";
    }
}
