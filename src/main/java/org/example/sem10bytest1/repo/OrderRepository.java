package org.example.sem10bytest1.repo;

import org.example.sem10bytest1.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
