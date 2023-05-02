package com.flight.fms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.fms.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer>{

}
