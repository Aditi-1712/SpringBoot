package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import web.entity.Customer;
import web.service.CustomerService;

@Controller
public class addCustomerController {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private web.service.addCustomerService addCustomerService;

    @GetMapping("/addCustomer")
    public String addCustomer(Model model) {

        model.addAttribute("customer", new Customer());
        return "addCustomer";
    }

    @PostMapping("/addCustomer")
    public String addCustomer(@ModelAttribute Customer customer, Model model) {
        addCustomerService.addCustomer(customer);
        model.addAttribute("data", customerService.getAllCustomers());
        model.addAttribute("columns", new String[]{"ID", "Name", "Address", "Phone Number"});
        return "customerView";
    }
}
