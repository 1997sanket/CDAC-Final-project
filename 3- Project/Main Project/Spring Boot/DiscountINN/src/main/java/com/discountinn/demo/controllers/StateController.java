package com.discountinn.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.discountinn.demo.models.State;
import com.discountinn.demo.services.StateService;

@CrossOrigin(origins="http://localhost:4200")
@RestController	
public class StateController {

	@Autowired
	StateService stateService;
	
	//Get list of States with Eager loaded cities
	@GetMapping("/states")
	public List<State> getStates(){
		return this.stateService.getStates();
	}
	
}
