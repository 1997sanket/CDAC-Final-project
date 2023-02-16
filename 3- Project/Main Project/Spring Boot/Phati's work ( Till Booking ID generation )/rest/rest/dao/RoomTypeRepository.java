package com.hobman.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hobman.rest.models.RoomType;

public interface RoomTypeRepository extends JpaRepository<RoomType, Integer> {
	public RoomType findByRoomType(String roomType);
}
