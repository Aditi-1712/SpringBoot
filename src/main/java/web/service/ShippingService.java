package web.service;

import web.entity.Customer;
import web.entity.Shipping;
import web.repository.ShippingDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ShippingService {
    @Autowired
    private ShippingDetailsRepository shippingRepository;

    public List<Shipping> getAllShippings() {
        return shippingRepository.findAll();
    }

    public void addShipping(Shipping shipping) {
        shippingRepository.save(shipping);
    }
}
