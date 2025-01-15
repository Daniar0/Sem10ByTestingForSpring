package org.example.sem10bytest1.service;

import org.example.sem10bytest1.model.Order;
import org.example.sem10bytest1.repo.OrderRepository;

import java.util.Optional;

@org.springframework.stereotype.Service
    public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    public Order processOrder(Order order) {
        if (order == null || order.getItems().isEmpty()) {
            throw new
                    IllegalArgumentException("Invalid order");

        }
        order.setStatus("Processed");
        return orderRepository.save(order);
    }
}


