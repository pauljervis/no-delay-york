package com.appstore.yorknodelays.server;

import java.util.List;

public class Airspace {
	
	private Weather weather;
	private Location location;
	private float size;
	private List<Route> routes;
	private List<Aircraft> aircraft;
	private List<Airport> airports;
	
	public Weather getWeather() {
		return weather;
	}
	public Location getLocation() {
		return location;
	}
	public float getSize() {
		return size;
	}
	public List<Route> getRoutes() {
		return routes;
	}
	public List<Aircraft> getAircraft() {
		return aircraft;
	}
	public List<Airport> getAirports() {
		return airports;
	}
	public void setWeather(Weather weather) {
		this.weather = weather;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public void setSize(float size) {
		this.size = size;
	}
	public void setRoutes(List<Route> routes) {
		this.routes = routes;
	}
	public void setAircraft(List<Aircraft> aircraft) {
		this.aircraft = aircraft;
	}
	public void setAirports(List<Airport> airports) {
		this.airports = airports;
	}

}
