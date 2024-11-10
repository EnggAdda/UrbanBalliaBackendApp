package org.example.urbanballiabackendapp.controller;

import org.example.urbanballiabackendapp.dto.ServiceDTO;
import org.example.urbanballiabackendapp.entity.Service;
import org.example.urbanballiabackendapp.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/services")
public class ServiceController {
    @Autowired
    private ServiceService serviceService;

    @GetMapping
    public List<ServiceDTO> getAllServices() {
        return serviceService.findAllServices();
    }
    @PostMapping
    public String insertService(@RequestBody Service requestBody) {
         serviceService.insertService(requestBody);
    return  "Successfully inserted the service ";
    }
}

