package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.entity.Product;
import web.entity.Shipping;
import web.repository.ProductRepository;
import web.repository.ShippingDetailsRepository;

@Service
public class addShippingService {

    @Autowired
    private ShippingDetailsRepository shippingDetailsRepository;


    public void addShipping(Shipping shipping) {
        shippingDetailsRepository.save(shipping);
    }
}
