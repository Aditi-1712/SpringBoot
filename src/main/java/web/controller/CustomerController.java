package web.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import web.entity.Customer;
import web.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/")
    public String index(Model model) {
        System.out.println("inside index function");
        return "index";
    }

    @GetMapping("customerView")
    public String customerView(Model model) {

        model.addAttribute("data", customerService.getAllCustomers());
        model.addAttribute("columns", new String[]{"ID", "Name", "Address", "Phone Number"});
        return "customerView";
    }

}
