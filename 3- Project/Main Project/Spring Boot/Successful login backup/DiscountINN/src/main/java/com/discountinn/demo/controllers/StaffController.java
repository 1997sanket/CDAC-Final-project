package com.discountinn.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.discountinn.demo.models.AuthRequest;
import com.discountinn.demo.util.JwtUtil;

@RestController
@CrossOrigin
public class StaffController {

	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@GetMapping("/hello")
	public String welcome() {
		return "hello";
	}
	
	
	/*
	 * Need to tell Spring 
	 * 	- If request is coming for "localhost:8080/authenticate" then don't apply security(don't ask for username and password)
	 */
	@PostMapping("/authenticate")
	public String generateToken(@RequestBody AuthRequest authRequest) {
		
		try {
			
			//Validates username and password
			authenticationManager.authenticate(
					
					new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword())
					);
			
			
		}catch (Exception e) {
			
			//throw new Exception("Invalid credentials");
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid credentials");
		}
		
		
		//If valid user then generate token
		return jwtUtil.generateToken(authRequest.getUsername());
	}
}
