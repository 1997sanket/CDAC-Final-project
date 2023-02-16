package com.example.demo.services;

import java.util.Optional;

import com.example.demo.models.Staff;

public interface StaffService {
	
	Optional<Staff> findByUsername(String username);
}
