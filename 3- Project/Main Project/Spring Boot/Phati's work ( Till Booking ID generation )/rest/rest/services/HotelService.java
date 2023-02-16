package com.hobman.rest.services;
import java.util.List;
import com.hobman.rest.models.Hotel;

public interface HotelService {
	
	public List<Hotel> getHotels();
	
	public Hotel getHotel(long id);
	
	public Hotel deleteHotel(long hotelId);
	
	public Hotel updateHotel(Hotel hotel,long hotelId);
	
	public Hotel addHotel(Hotel hotel);
	
	public List<Hotel> findByState(String state);
	
	public List<Hotel> findByCity(String city);
	

}
