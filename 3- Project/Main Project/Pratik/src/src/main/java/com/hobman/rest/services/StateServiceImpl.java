package com.hobman.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hobman.rest.dao.StateRepository;
import com.hobman.rest.models.City;
import com.hobman.rest.models.State;

@Service
public class StateServiceImpl implements StateService {

	@Autowired
	StateRepository stateRepo;
	
	@Override
	public List<State> getStates() {
		return (List<State>)this.stateRepo.findAll();
	}

}
