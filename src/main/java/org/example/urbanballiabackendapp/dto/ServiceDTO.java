package org.example.urbanballiabackendapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ServiceDTO {
    private Long id;
    private String title;
    private String description;
    private double price;
    private String category;


    // Constructors, Getters, Setters
}

