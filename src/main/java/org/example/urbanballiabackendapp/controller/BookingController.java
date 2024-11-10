package org.example.urbanballiabackendapp.controller;

import org.example.urbanballiabackendapp.entity.Booking;
import org.example.urbanballiabackendapp.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @PostMapping
    public Booking bookService(@RequestBody Booking booking) {
        return bookingService.saveBooking(booking);
    }
}

