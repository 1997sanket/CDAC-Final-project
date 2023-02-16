package com.hobman.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hobman.rest.models.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
