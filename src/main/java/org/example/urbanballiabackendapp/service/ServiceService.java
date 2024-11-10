package org.example.urbanballiabackendapp.service;

import org.example.urbanballiabackendapp.dto.ServiceDTO;
import org.example.urbanballiabackendapp.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service
public class ServiceService {
    @Autowired
    private ServiceRepository serviceRepository;

    public List<org.example.urbanballiabackendapp.entity.Service> findAllServices1() {
        return serviceRepository.findAll();
    }

    public List<org.example.urbanballiabackendapp.entity.Service> findServicesByCategory(String category) {
        return serviceRepository.findByCategory(category);
    }
    public void insertService(org.example.urbanballiabackendapp.entity.Service service) {
         serviceRepository.save(service);
    }

    public List<ServiceDTO> findAllServices() {
        return serviceRepository.findAll()
                .stream()
                .map(service -> new ServiceDTO(service.getId(), service.getTitle(),
                        service.getDescription(), service.getPrice(), service.getCategory()))
                .collect(Collectors.toList());
    }

}

