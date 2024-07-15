package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.entity.Orders;
import web.repository.OrderRepository;

@Service
public class addOrderService {

    @Autowired
    private OrderRepository orderRepository;

    public void addOrders(Orders orders) {
        orderRepository.save(orders);
    }
}
