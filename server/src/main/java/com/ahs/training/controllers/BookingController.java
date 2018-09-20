package com.ahs.training.controllers;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ahs.training.model.Booking;
import com.ahs.training.service.BookingService;

@RestController
public class BookingController {
	
	BookingService bookingService;
	
	public BookingController(BookingService _bookingService){
		bookingService = _bookingService;
	}
	
	@GetMapping("/getAll")
	public Object[] getAllBookings(HttpServletResponse response){
		response.setStatus(200);
	    return bookingService.getAll();
	}
	
	@GetMapping("/getById/{Id}")
	public Booking getBookingById(@PathVariable long Id, HttpServletResponse response){
		response.setStatus(200);
		return null;
	}

	@PostMapping("/addBooking")
	public Booking addBooking(@RequestBody Booking newBooking, HttpServletResponse response){
		response.setStatus(200);
		return bookingService.addBooking(newBooking);
	}
	
	@PostMapping("/updateBooking")
	public Booking updateBooking(@RequestBody Booking updatedBooking, HttpServletResponse response){
		response.setStatus(400);
		return null;
	}
	
	@PostMapping("/removeBooking")
	public Booking removeBooking(@RequestBody Booking removedBooking, HttpServletResponse response){
		response.setStatus(400);
		return null;
	}
}
