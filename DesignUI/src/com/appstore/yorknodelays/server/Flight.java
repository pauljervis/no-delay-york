package com.appstore.yorknodelays.server;

import java.util.Date;

public class Flight {

	private String id;
	private Airport departure;
	private Airport destination;
	private Date departuredate;
	private Date etaDate;
	private int	flightDuration;
	private Airline airline;
	private Aircraft aircraft;
	private String remark;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Airport getDeparture() {
		return departure;
	}
	public void setDeparture(Airport departure) {
		this.departure = departure;
	}
	public Airport getDestination() {
		return destination;
	}
	public void setDestination(Airport destination) {
		this.destination = destination;
	}
	public Date getDeparturedate() {
		return departuredate;
	}
	public void setDeparturedate(Date departuredate) {
		this.departuredate = departuredate;
	}
	public Date getEtaDate() {
		return etaDate;
	}
	public void setEtaDate(Date etaDate) {
		this.etaDate = etaDate;
	}
	public int getFlightDuration() {
		return flightDuration;
	}
	public void setFlightDuration(int flightDuration) {
		this.flightDuration = flightDuration;
	}
	public Airline getAirline() {
		return airline;
	}
	public void setAirline(Airline airline) {
		this.airline = airline;
	}
	public Aircraft getAircraft() {
		return aircraft;
	}
	public void setAircraft(Aircraft aircraft) {
		this.aircraft = aircraft;
	}
	
	
}
