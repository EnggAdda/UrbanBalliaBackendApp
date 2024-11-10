package org.example.urbanballiabackendapp.repository;

import org.example.urbanballiabackendapp.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {}
