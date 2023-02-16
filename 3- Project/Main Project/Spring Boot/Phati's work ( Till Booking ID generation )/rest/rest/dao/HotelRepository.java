package com.hobman.rest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hobman.rest.models.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,Long> {
	public List<Hotel> findByState(String state);
	public List<Hotel> findByCity(String city);
}
