package edu.microservices.server3.service;

import edu.microservices.server3.model.Product;

import java.util.List;

public interface IProductService {

    void add(Product product);

    Product findById(Long id);

    Product update(Product product);

    void delete(Long id);

    List<Product> findAll();
}
