package com.flight.fms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flight.fms.entity.Flight;
import com.flight.fms.repository.FlightRepository;
import com.flight.fms.service.FlightService;

@Service
public class FlightServiceImpl implements FlightService{
	
	private FlightRepository flightRepo;
	
	public FlightServiceImpl(FlightRepository flightRepo) {
		super();
		this.flightRepo = flightRepo;
	}



	@Override
	public List<Flight> getAllFlightDetails() {
		return flightRepo.findAll();
	}



	@Override
	public Flight saveFlight(Flight flight) {
		return flightRepo.save(flight);
	}



	@Override
	public Flight updateFlight(Flight flight) {
		return flightRepo.save(flight);
	}



	@Override
	public Flight getFlightById(int id) {
		return flightRepo.findById(id).get();
	}



	@Override
	public void deleteFlightById(int id) {
		 flightRepo.deleteById(id);
	}



	
}
