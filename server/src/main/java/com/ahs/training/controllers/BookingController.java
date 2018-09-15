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

	}
	
	@GetMapping("/getAll")
	public Booking[] getAllBookings(HttpServletResponse response){
		response.setStatus(500);
		return null;
	}
	
	@GetMapping("/getById/{Id}")
	public Booking getBookingById(@PathVariable long id, HttpServletResponse response){
		response.setStatus(500);
		return null;
	}

	@PostMapping("/addBooking")
	public Booking addBooking(@RequestBody Booking newBooking, HttpServletResponse response){
		response.setStatus(500);
		return null;
	}
	
	@PostMapping("/updateBooking")
	public Booking updateBooking(@RequestBody Booking booking, HttpServletResponse response){
		response.setStatus(500);
		return null;
	}
}
