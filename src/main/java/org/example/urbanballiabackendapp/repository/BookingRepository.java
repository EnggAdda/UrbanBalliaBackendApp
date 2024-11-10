package org.example.urbanballiabackendapp.repository;

import org.example.urbanballiabackendapp.entity.Booking;
import org.example.urbanballiabackendapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByUser(User user);
}

