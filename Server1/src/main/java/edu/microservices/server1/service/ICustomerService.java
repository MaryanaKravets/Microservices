package edu.microservices.server1.service;

import edu.microservices.server1.model.Customer;

import java.util.List;

public interface ICustomerService {

    void add(Customer customer);

    Customer findById(Long id);

    Customer update(Customer customer);

    void delete(Long id);

    List<Customer> findAll();
}
