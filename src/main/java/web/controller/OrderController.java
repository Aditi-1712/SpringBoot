package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import web.entity.Customer;
import web.entity.Orders;
import web.service.OrderService;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;


    @GetMapping("/orderView")
    public String viewTable(Model model) {

                model.addAttribute("data", orderService.getAllOrders());
                model.addAttribute("columns", new String[]{"Order ID", "Shipping ID", "Customer ID", "Product ID"});

        return "orderView";
    }


}

