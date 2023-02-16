package com.hobman.rest.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hobman.rest.dao.HotelRepository;
import com.hobman.rest.models.Hotel;

@Service
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	private HotelRepository hotelrepo;
	
	

	@Override
	public List<Hotel> getHotels() {
		return this.hotelrepo.findAll();
	}

	@Override
	public Hotel getHotel(long id) {
		return (Hotel)this.hotelrepo.getOne(id);
	}

	@Override
	public Hotel deleteHotel(long hotelId) {
		Hotel hotel = this.hotelrepo.getOne(hotelId);
		if(hotel!=null) {
			this.hotelrepo.delete(hotel);
		}
		return hotel;
	}

	@Override
	public Hotel updateHotel(Hotel hotel, long hotelId) {
		Hotel checkHotel = this.hotelrepo.getOne(hotelId);
		if(checkHotel!=null) {
			this.hotelrepo.save(hotel);
		}
		return hotel;
	}

	@Override
	public Hotel addHotel(Hotel hotel) {
		this.hotelrepo.save(hotel);
		return hotel;
	}

	@Override
	public List<Hotel> findByState(String state) {
		return this.hotelrepo.findByState(state);
	}

	@Override
	public List<Hotel> findByCity(String city) {
		return this.hotelrepo.findByCity(city);
	}



}
