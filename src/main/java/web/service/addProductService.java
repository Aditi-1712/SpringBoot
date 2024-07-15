package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.entity.Product;
import web.repository.ProductRepository;

@Service
public class addProductService {

    @Autowired
    private ProductRepository productRepository;


    public void addProduct(Product product) {
        productRepository.save(product);
    }
}
