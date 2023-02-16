package com.hobman.rest.controllers;
import java.util.List;
import java.util.Map;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.*;
import org.springframework.jdbc.core.RowMapper;  
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.xml.xpath.JaxenXPathTemplate;

import com.hobman.rest.models.FindTheHotel;
import com.hobman.rest.models.Hotel;
import com.hobman.rest.services.HotelService;

@CrossOrigin(origins="http://localhost:4200")
@RestController	
public class HotelController {
	@Autowired
	HotelService hotelService;
	
	@Autowired
	JdbcTemplate jdbcTemplate ;
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
	
	//Get Hotel by id
	@GetMapping("/hotels/roomType/{roomType}")
	public Set<Hotel> getHotelByRoomType(@PathVariable("roomType") String roomType) {
		return this.hotelService.findByRoomType(roomType);
	}
	
	
	//Get Hotels in a state 
	@GetMapping("/hotels/state/{state}")
	public List<Hotel> getHotelsByState(@PathVariable("state") String state) {
		return this.hotelService.findByState(state);
	}
	@GetMapping("/hotels/pinCode/{pinCode}")
	public List<FindTheHotel> findbyPinCode(@PathVariable("pinCode") String pinCode) {
		
		String sql = 
				 "select a.hotel_id,a.hotel_name,a.city,a.state,a.pin_code,a.dist_from_city_center,b.room_type,b.rent"
			   +" from hotel a"
			   +" inner join "
			   +" room_type b "
			   + "on a.room_type_id=b.room_type_id "
			+ "where a.pin_code="+pinCode;
		return jdbcTemplate.query(
                sql,
                new RowMapper<FindTheHotel>(){
                	@Override
                	public FindTheHotel mapRow(ResultSet rs, int rownumber) throws SQLException{
                	FindTheHotel f=new FindTheHotel();
                	f.setHotelId(rs.getInt(1));
                	f.setHotelName(rs.getString(2));
                	f.setCity(rs.getString(3));
                	f.setState(rs.getString(4));
                	f.setPinCode(rs.getString(5));
                	f.setDistFromCityCenter(rs.getFloat(6));
                	f.setRoomType(rs.getString(7));
                	f.setRent(rs.getDouble(8));
					return f;
                	
                }});

        //return customers;
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