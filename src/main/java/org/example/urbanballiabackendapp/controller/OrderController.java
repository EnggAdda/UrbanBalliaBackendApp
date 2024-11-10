package org.example.urbanballiabackendapp.controller;

import org.example.urbanballiabackendapp.constant.OrderStatus;
import org.example.urbanballiabackendapp.entity.*;
import org.example.urbanballiabackendapp.repository.OrderItemRepository;
import org.example.urbanballiabackendapp.repository.OrderRepository;
import org.example.urbanballiabackendapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @PostMapping("/place")
    public ResponseEntity<String> placeOrder(@RequestBody OrderRequest orderRequest) {
        // Fetch or create user
        User user = userRepository.findByPhoneNumber(orderRequest.getPhoneNumber())
                .orElseGet(() -> {
                    User newUser = new User();
                    newUser.setName(orderRequest.getName());
                    newUser.setPhoneNumber(orderRequest.getPhoneNumber());
                    newUser.setEmail(orderRequest.getEmail());
                    newUser.setAddress(orderRequest.getAddress());
                    return userRepository.save(newUser);
                });

        // Create and save order
        Order order = new Order();
        order.setUser(user);
        order.setTotalAmount(orderRequest.getTotalAmount());
        order.setPaymentMode(orderRequest.getPaymentMode());
        order.setOrderStatus(OrderStatus.PENDING);
        order = orderRepository.save(order);

        // Save order items
        for (OrderItemRequest itemRequest : orderRequest.getItems()) {
            OrderItem item = new OrderItem();
            item.setOrder(order);
            item.setServiceId(itemRequest.getServiceId());
            item.setServiceTitle(itemRequest.getServiceTitle());
            item.setPrice(itemRequest.getPrice());
            orderItemRepository.save(item);
        }

        return ResponseEntity.ok("Order placed successfully!");
    }
}

