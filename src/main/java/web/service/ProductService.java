package web.service;

import web.entity.Customer;
import web.entity.Product;
import web.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

        @Autowired
        private ProductRepository productRepository;

        public List<Product> getAllProducts() {
            return productRepository.findAll();
        }

    public void addProduct(Product product) {
        productRepository.save(product);
    }
}

