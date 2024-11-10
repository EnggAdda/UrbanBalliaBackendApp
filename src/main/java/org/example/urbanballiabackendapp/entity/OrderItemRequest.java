package org.example.urbanballiabackendapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderItemRequest {
    private int serviceId;
    private String serviceTitle;
    private BigDecimal price;

    // Getters and Setters
}