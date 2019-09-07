package edu.microservices.service2.service;

import edu.microservices.service2.model.Order;
import edu.microservices.service2.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
class OrderService implements IOrderService {
    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order add(Order order) {
        return orderRepository.saveAndFlush(order);
    }

    @Override
    public Order findById(Long id) {
        return orderRepository.findById(id).get();
    }

    @Override
    public Order update(Order order) {
        return orderRepository.saveAndFlush(order);
    }

    @Override
    public void delete(Long id) {
        orderRepository.deleteById(id);
    }
}
