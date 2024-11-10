package org.example.urbanballiabackendapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.urbanballiabackendapp.constant.PaymentMode;

import java.math.BigDecimal;
import java.util.List;

// OrderRequest.java
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderRequest {
    private String name;
    private String phoneNumber;
    private String email;
    private String address;
    private BigDecimal totalAmount;
    private PaymentMode paymentMode;
    private List<OrderItemRequest> items;

    // Getters and Setters
}

// OrderItemRequest.java


