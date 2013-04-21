package com.appstore.yorknodelays.shared;

import java.util.List;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

public class Airline {
	
	private String name;
	private String id;
	private String IATA;
	private String ICAO;
	private String callsign;
	private String country;
	private boolean active;
	private List<Flight> flights;
	private List<Aircraft> aircraft;
	private List<Route> routes;
	private List<Schedule> schedules;
	
	
	public boolean addAirlineToDatabase(String key) {
		
		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		Entity e = new Entity("Airline", key);
		e = addAirlineToEntity(e);
		ds.put(e);
		
		return true;
	}
	
	public boolean addAirlineToDatabase() {
		
		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		Entity e = new Entity("Airline");
		e = addAirlineToEntity(e);
		ds.put(e);
		
		return true;
	}
	
	public Entity addAirlineToEntity(Entity e) {
		
		e.setProperty("id", id);
		e.setProperty("name", name);
		e.setProperty("IATA", IATA);
		e.setProperty("ICAO", ICAO);
		e.setProperty("callsign", callsign);
		e.setProperty("country", country);
		e.setProperty("active", active);
		
		return e;
	}
	
	
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public String getIATA() {
		return IATA;
	}
	public String getICAO() {
		return ICAO;
	}
	public String getCallsign() {
		return callsign;
	}
	public String getCountry() {
		return country;
	}
	public boolean isActive() {
		return active;
	}
	public List<Flight> getFlights() {
		return flights;
	}
	public List<Aircraft> getAircraft() {
		return aircraft;
	}
	public List<Route> getRoutes() {
		return routes;
	}
	public List<Schedule> getSchedules() {
		return schedules;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setIATA(String iATA) {
		IATA = iATA;
	}
	public void setICAO(String iCAO) {
		ICAO = iCAO;
	}
	public void setCallsign(String callsign) {
		this.callsign = callsign;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}
	public void setAircraft(List<Aircraft> aircraft) {
		this.aircraft = aircraft;
	}
	public void setRoutes(List<Route> routes) {
		this.routes = routes;
	}
	public void setSchedules(List<Schedule> schedules) {
		this.schedules = schedules;
	}
	
	
	

}
