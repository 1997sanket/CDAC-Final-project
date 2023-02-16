package com.hobman.rest.services;

import com.hobman.rest.models.Booking;
import com.hobman.rest.models.Customer;

public interface BookingService {
	
	public Booking findByBookingId(long bookingId);
	
	public Booking newBooking(Customer customer, String checkIn, String checkOut, long hotelId);

	
}
