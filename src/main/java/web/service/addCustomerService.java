package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.entity.Customer;
import web.repository.CustomerDetailsRepository;

@Service
public class addCustomerService {

    @Autowired
    private CustomerDetailsRepository customerRepository;

    public void addCustomer(Customer customer) {
        customerRepository.save(customer);
    }
}
