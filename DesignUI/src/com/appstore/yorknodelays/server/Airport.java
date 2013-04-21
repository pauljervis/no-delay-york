package com.appstore.yorknodelays.server;

import java.util.List;

public class Airport {
	
	private List<Gate> gate;
	private List<Airline> airline;
	private List<Route> route;
	private Weather weather;
	private Location location;
	private List<Runway> runway;
	private String id;
	private String name;
	private String threeCode;
	private String fourCode;
	private boolean active;
	
	
	public List<Gate> getGate() {
		return gate;
	}
	public List<Airline> getAirline() {
		return airline;
	}
	public List<Route> getRoute() {
		return route;
	}
	public Weather getWeather() {
		return weather;
	}
	public Location getLocation() {
		return location;
	}
	public List<Runway> getRunway() {
		return runway;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getThreeCode() {
		return threeCode;
	}
	public String getFourCode() {
		return fourCode;
	}
	public boolean isActive() {
		return active;
	}
	public void setGate(List<Gate> gate) {
		this.gate = gate;
	}
	public void setAirline(List<Airline> airline) {
		this.airline = airline;
	}
	public void setRoute(List<Routes> route) {
		this.route = route;
	}
	public void setWeather(Weather weather) {
		this.weather = weather;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public void setRunway(List<Runway> runway) {
		this.runway = runway;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setThreeCode(String threeCode) {
		this.threeCode = threeCode;
	}
	public void setFourCode(String fourCode) {
		this.fourCode = fourCode;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	

}
