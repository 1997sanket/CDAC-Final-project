package com.hobman.rest.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.hobman.rest.models.Hotel;
import com.hobman.rest.services.HotelService;

@CrossOrigin(origins="http://localhost:4200")
@RestController	
public class HotelController {
	@Autowired
	HotelService hotelService;
	
	//Get all hotels
	@GetMapping("/hotels")
	public List<Hotel> getHotels(){
		return this.hotelService.getHotels();
	}
	
	//Get Hotel by id
	@GetMapping("/hotels/{hotelId}")
	public Hotel getHotel(@PathVariable("hotelId") long hotelId) {
		return this.hotelService.getHotel(hotelId);
	}
	
	//Get Hotels in a state 
	@GetMapping("/hotels/state/{state}")
	public List<Hotel> getHotelsByState(@PathVariable("state") String state) {
		return this.hotelService.findByState(state);
	}
	
	//Get Hotels in a city 
	@GetMapping("/hotels/city/{city}")
	public List<Hotel> getHotelsByCity(@PathVariable("city") String city) {
		return this.hotelService.findByCity(city);
	}
	
	//Update a hotel 
	@PutMapping("/hotels/{hotelId}")
	public Hotel updateHotel(@RequestBody Hotel hotel, @PathVariable("hotelId") long hotelId) {
		return this.hotelService.updateHotel(hotel, hotelId);
	}
	
	//Add a new Hotel
	@PostMapping("/hotels")
	public Hotel addHotel(@RequestBody Hotel hotel) {
		return this.hotelService.addHotel(hotel);
		
	}
	
	//Delete a hotel
	@DeleteMapping("hotels/{hotelId}")
	public Hotel deleteHotel(@PathVariable long hotelId) {
		return this.hotelService.deleteHotel(hotelId);
		
	}
	
}