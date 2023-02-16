package com.hobman.rest.services;
import com.hobman.rest.models.Booking;

public interface BookingService {
	
	public Booking findByBookingId(long bookingId);
	
	public Booking newBooking(Booking booking);
	
	public Booking deleteBooking(long bookingId);
	
	public Booking updateBooking(Booking booking, long bookingId);

	
}
