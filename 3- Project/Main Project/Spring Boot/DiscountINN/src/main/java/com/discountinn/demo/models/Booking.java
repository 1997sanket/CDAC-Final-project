package com.discountinn.demo.models;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Booking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long bookingId;
	private String checkIn;
	private String checkOut;
	private long hotelId;
	
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
    private Customer customer;
	
	public Booking() {
		super();
	}
			
	public Booking(/*long bookingId, */ String checkIn, String checkOut, long hotelId, Customer customer) {
		super();
		//this.bookingId = bookingId;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.hotelId = hotelId;
		this.customer = customer;
	}



	public long getBookingId() {
		return bookingId;
	}
	/*public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	} */
	
	public String getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}
	public String getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public long getHotelId() {
		return hotelId;
	}

	public void setHotelId(long hotelId) {
		this.hotelId = hotelId;
	}
		

}
