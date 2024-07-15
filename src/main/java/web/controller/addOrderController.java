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
public class addOrderController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private web.service.addOrderService addOrderService;

    @GetMapping("addOrder")
    public String addCustomer(Model model) {

        model.addAttribute("orders", new Customer());
        return "addOrder";
    }

    @PostMapping("/addOrder")
    public String addCustomer(@ModelAttribute Orders orders, Model model) {
        addOrderService.addOrders(orders);
        model.addAttribute("data", orderService.getAllOrders());
        model.addAttribute("columns", new String[]{"orderId", "shippingId", "customerId", "productId"});
        return "addOrder";
    }
}
