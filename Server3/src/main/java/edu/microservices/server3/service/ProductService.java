package edu.microservices.server3.service;


import edu.microservices.server3.model.Product;
import edu.microservices.server3.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class ProductService implements IProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void add(Product product) {
        productRepository.saveAndFlush(product);
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public Product update(Product product) {
        return productRepository.saveAndFlush(product);
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
