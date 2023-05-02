package com.flight.fms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "flightinformation")
public class Flight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int flightNumber;
	
	@Column(name = "filghtName")
	private String filghtName;
	
	@Column(name = "originCountry")
	private String originCountry;
	
	@Column(name = "destinationCountry")
	private String destinationCountry;
	
	public Flight() {}
	
	public Flight(int flightNumber, String filghtName, String originCountry, String destinationCountry) {
		super();
		this.flightNumber = flightNumber;
		this.filghtName = filghtName;
		this.originCountry = originCountry;
		this.destinationCountry = destinationCountry;
	}
	
	public int getFlightNumber() {
		return flightNumber;
	}
	public String getFilghtName() {
		return filghtName;
	}
	public String getOriginCountry() {
		return originCountry;
	}
	public String getDestinationCountry() {
		return destinationCountry;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public void setFilghtName(String filghtName) {
		this.filghtName = filghtName;
	}
	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}
	public void setDestinationCountry(String destinationCountry) {
		this.destinationCountry = destinationCountry;
	}
	
}
