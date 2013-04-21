package com.appstore.yorknodelays.server;

import java.util.List;

public class Schedule {
	
	private String id;
	private List<Flight> flights;
	private List<Airline> airlines;
	private List<Airport> sourceAirports;
	private List<Airport> destinationAirports;
	private List<Aircraft> aircraft;
	private List<Boolean> active;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<Flight> getFlights() {
		return flights;
	}
	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}
	public List<Airline> getAirlines() {
		return airlines;
	}
	public void setAirlines(List<Airline> airlines) {
		this.airlines = airlines;
	}
	public List<Airport> getSourceAirports() {
		return sourceAirports;
	}
	public void setSourceAirports(List<Airport> sourceAirports) {
		this.sourceAirports = sourceAirports;
	}
	public List<Airport> getDestinationAirports() {
		return destinationAirports;
	}
	public void setDestinationAirports(List<Airport> destinationAirports) {
		this.destinationAirports = destinationAirports;
	}
	public List<Aircraft> getAircraft() {
		return aircraft;
	}
	public void setAircraft(List<Aircraft> aircraft) {
		this.aircraft = aircraft;
	}
	public List<Boolean> getActive() {
		return active;
	}
	public void setActive(List<Boolean> active) {
		this.active = active;
	}

}
