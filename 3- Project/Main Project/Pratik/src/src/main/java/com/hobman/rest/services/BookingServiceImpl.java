package com.hobman.rest.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hobman.rest.dao.BookingRepository;
import com.hobman.rest.dao.CustomerRepository;
import com.hobman.rest.models.Booking;
import com.hobman.rest.models.Customer;


@Service
public class BookingServiceImpl implements BookingService {
	
	@Autowired
	public BookingRepository bookingrepo;
	
	@Autowired
	public CustomerRepository customerrepo;
	
	

	@Override
	public Booking findByBookingId(long bookingId) {
		// TODO Auto-generated method stub
		return this.bookingrepo.findByBookingId(bookingId) ;
	}

	
	@Override
	public Booking newBooking(Customer customer, String checkIn, String checkOut, long hotelId) {
		// TODO Auto-generated method stub
		
		Customer cust=this.customerrepo.save(customer);
		Booking b=new Booking(hotelId, checkOut, checkOut);
		cust.setBooking(b);
		return b;
	}

}
