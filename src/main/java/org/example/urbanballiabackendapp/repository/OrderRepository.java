package org.example.urbanballiabackendapp.repository;


import org.example.urbanballiabackendapp.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
