package com.ahs.training.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import org.springframework.stereotype.Service;

import com.ahs.training.model.Booking;

@Service
public class BookingService {
	
	LinkedList<Booking> bookings;
	
	public BookingService(){
		bookings = new LinkedList<Booking>();
	}
	
	public Booking[] getAll(){
		return null;
	}
	
	public Booking getById(long id){
		return null;
	}
	
	public Booking addBooking(Booking newBooking){
		newBooking.setId(bookings.size());
		bookings.add(newBooking);
		Collections.sort(bookings, new sortByTime());
		return newBooking;
	}
	
	public Booking updateBooking(Booking booking){
		return null;
	}
}

class sortByTime implements Comparator<Booking>{

	@Override
	public int compare(Booking booking0, Booking booking1) {
		if(booking0.getTime() > booking1.getTime()) return 1;
		else if(booking0.getTime() < booking1.getTime()) return -1;
		else return 0;
	}
	
}
