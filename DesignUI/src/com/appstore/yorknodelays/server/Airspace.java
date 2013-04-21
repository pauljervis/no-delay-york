package com.appstore.yorknodelays.server;

import java.util.List;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

public class Airspace {
	
	private int id;
	private Weather weather;
	private Location location;
	private float size; 			// Length/Width dimension of square airspace
	private List<Route> routes;
	private List<Aircraft> aircraft;
	private List<Airport> airports;
	
	public boolean addAirspaceToDatabase(String key) {
		
		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		Entity e = new Entity("Airspace", key);
		e = addAirspaceToEntity(e);
		ds.put(e);
		
		return true;
	}
	
	public boolean addAirspaceToDatabase() {
		
		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		Entity e = new Entity("Airspace");
		e = addAirspaceToEntity(e);
		ds.put(e);
		
		return true;
	}
	
	public Entity addAirspaceToEntity(Entity e) {
		
		e.setProperty("id", id);
		e.setProperty("weather", weather);
		e.setProperty("location", location);
		e.setProperty("size", size);
		
		return e;
	}
	
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
