package com.hobman.rest.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.hobman.rest.models.Booking;
import com.hobman.rest.models.Customer;
import com.hobman.rest.services.BookingService;

@CrossOrigin(origins="http://localhost:4200")
@RestController	
public class BookingController {

@Autowired
BookingService bookingService;
	
	@GetMapping("/booking/{bookingId}")
	public Booking getbooking(@PathVariable("bookingId") long bookingId) {
		return this.bookingService.findByBookingId(bookingId);
	}
	
	@PostMapping("/booking")
	public Booking addHotel(@RequestBody Customer customer,long hotelId, String checkIn, String checkOut) {
		return this.bookingService.newBooking(customer, checkIn, checkOut, hotelId);
		
	}
}
