package org.example.urbanballiabackendapp.service;

import org.example.urbanballiabackendapp.entity.Booking;
import org.example.urbanballiabackendapp.entity.User;
import org.example.urbanballiabackendapp.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    public Booking saveBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public List<Booking> findBookingsByUser(User user) {
        return bookingRepository.findByUser(user);
    }
}

