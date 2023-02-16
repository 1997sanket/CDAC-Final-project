/**
 * 
 */
package com.example.demo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.models.Staff;
import com.example.demo.repositories.StaffRepository;
import com.example.demo.services.StaffService;

/**
 * @author Sanket Kamble
 *
 */

@RestController
@CrossOrigin
public class StaffController {
	
	@Autowired
	StaffService service;

	@GetMapping("/hello/{hotelCode}/{username}/{password}")
	public boolean hello(@PathVariable String hotelCode, @PathVariable String username, @PathVariable String password) {
		
		boolean value = false;
		
		Optional<Staff> op = service.findByUsername(username);
		
		Staff ref = op.orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "No such staff exists"));
		
		if(ref.getHotelCode().equals(hotelCode) && ref.getPassword().equals(password)) {
			value = true;
		}
		else {
			value = false;
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid hotel code or password");
		}
		
		return value;
	}
}
