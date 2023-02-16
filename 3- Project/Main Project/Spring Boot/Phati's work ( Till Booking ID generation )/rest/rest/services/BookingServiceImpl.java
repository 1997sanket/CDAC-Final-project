package com.hobman.rest.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hobman.rest.dao.BookingRepository;
import com.hobman.rest.dao.CustomerRepository;
import com.hobman.rest.models.Booking;


@Service
public class BookingServiceImpl implements BookingService {
	
	@Autowired
	public BookingRepository bookingrepo;
	
	@Autowired
	public CustomerRepository customerrepo;
	
	

	@Override
	public Booking findByBookingId(long bookingId) {
		return this.bookingrepo.findByBookingId(bookingId);
	}

	
	@Override
	public Booking newBooking(Booking booking) {
		return this.bookingrepo.save(booking);
	}


	@Override
	public Booking deleteBooking(long bookingId) {
		Booking booking= this.bookingrepo.getOne(bookingId);
		if(booking!=null) {
			this.bookingrepo.delete(booking);
		}
		return booking;
	}


	@Override
	public Booking updateBooking(Booking booking, long bookingId) {
		Booking booking1 = this.bookingrepo.getOne(bookingId);
		if(booking1 !=null) {
			this.bookingrepo.save(booking);
		}
		return booking;
		
	}

}
