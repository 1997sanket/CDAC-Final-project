package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Staff;
import com.example.demo.repositories.StaffRepository;

@Service
public class StaffServiceImpl implements StaffService {
	
	@Autowired
	StaffRepository repo;

	@Override
	public Optional<Staff> findByUsername(String username) {
		// TODO Auto-generated method stub
		return repo.findById(username);
	}

}
