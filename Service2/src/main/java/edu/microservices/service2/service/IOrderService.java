package edu.microservices.service2.service;

import edu.microservices.service2.model.Order;


public interface IOrderService {

    Order add(Order order);

    Order findById(Long id);

    Order update(Order order);

    void delete(Long id);
}
