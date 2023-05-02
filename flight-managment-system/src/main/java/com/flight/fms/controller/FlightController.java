package com.flight.fms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.flight.fms.entity.Flight;
import com.flight.fms.service.FlightService;

@Controller
public class FlightController {

	private FlightService flightService;

	public FlightController(FlightService flightService) {
		super();
		this.flightService = flightService;
	}
	
	// handler method to handle list of flights and return mode and view
	@GetMapping("/flight-details")
	public String listAllFlights(Model model) {
		model.addAttribute("flights", flightService.getAllFlightDetails());
		return "flights";
	}
	
	@GetMapping("/flight-details/new")
	public String createFlightForm(Model model) {
		// create flight object to hold flight form data
		Flight flight = new Flight();
		model.addAttribute("flight", flight);
		return "create_flight";
	}
	
	@PostMapping("/flight-details")
	public String saveFlight(@ModelAttribute("flight") Flight flight) {
		flightService.saveFlight(flight);
		return "redirect:/flight-details";
	}
	
	@GetMapping("/flight-details/edit/{id}")
	public String editFlightForm(@PathVariable int id, Model model) {
		model.addAttribute("flight", flightService.getFlightById(id));
		return "edit_flight";
	}
	
	@PostMapping("/flight-details/{id}")
	public String updateFlightDetails(@PathVariable int id, @ModelAttribute("flight") Flight flight,Model model) {
		
		//get flight from database by id
		Flight exsitingFlight = flightService.getFlightById(id);
		exsitingFlight.setFlightNumber(id);
		exsitingFlight.setFilghtName(flight.getFilghtName());
		exsitingFlight.setOriginCountry(flight.getOriginCountry());
		exsitingFlight.setDestinationCountry(flight.getDestinationCountry());
		
		// save upadted flight object
		flightService.updateFlight(exsitingFlight);
		return "redirect:/flight-details";
	}
	
	// delete flight detalis by Id
	@GetMapping("/flight-details/{id}")
	public String deleteFlight(@PathVariable int id) {
		flightService.deleteFlightById(id);
		return "redirect:/flight-details";
	}
	
	
}
