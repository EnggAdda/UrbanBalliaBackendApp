package org.example.urbanballiabackendapp.repository;

import org.example.urbanballiabackendapp.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Map;

public interface ServiceRepository extends JpaRepository<Service, Long> {
    List<Service> findByCategory(String category);

}
