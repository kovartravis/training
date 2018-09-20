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
		initializeBookings(bookings);
	}
	
	public Object[] getAll(){
		return bookings.toArray();
	}
	
	//utility function, the index of the booking may not be the same as the id
	public int getIndex(long id){
		for(int i = 0; i < bookings.size(); i++){
			if(bookings.get(i).getId() == id){
				return i;
			}
		}
		
		return -1;
	}
	
	public Booking addBooking(Booking newBooking){
		newBooking.setId(bookings.size());
		bookings.add(newBooking);
		Collections.sort(bookings, new sortByTime());
		return newBooking;
	}
	
	public Booking updateBooking(Booking updatedBooking){
		return null;
	}
	
	public Booking removeBooking(Booking removedBooking){
		return null;
	}
	
	//add 10 random bookings for test data
	private void initializeBookings(LinkedList<Booking> _bookings){
		for(int i = 0; i < 10; i++){
			Booking booking = new Booking();
			booking.setId(i);
			booking.setTime((long) (Math.random() * Long.MAX_VALUE));
			_bookings.add(booking);
		}
		Collections.sort(_bookings, new sortByTime());
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
