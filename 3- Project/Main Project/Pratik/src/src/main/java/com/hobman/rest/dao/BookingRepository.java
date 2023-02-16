package com.hobman.rest.dao; 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hobman.rest.models.Booking;


@Repository
public interface BookingRepository extends JpaRepository<Booking,Long> {
	
	public Booking findByBookingId(long bookingId);

}
