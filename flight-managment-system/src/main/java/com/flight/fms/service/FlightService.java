package com.flight.fms.service;

import java.util.List;

import com.flight.fms.entity.Flight;

public interface FlightService {

		List<Flight> getAllFlightDetails();
		Flight saveFlight(Flight flight);
		Flight getFlightById(int id);
		Flight updateFlight(Flight flight);
		void deleteFlightById(int id);
}
