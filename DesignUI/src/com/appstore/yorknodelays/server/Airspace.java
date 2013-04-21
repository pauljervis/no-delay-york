package com.appstore.yorknodelays.server;

import java.util.List;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

public class Airspace {
	
	private int id;
	private Weather weather;
	private Location location;		// Lower left corner (defines {0,0} )
	private float size; 			// Length/Width dimension of square airspace
	private List<Route> routes;
	private List<Aircraft> aircrafts;
	private List<Airport> airports;
	private List<Airspace> neighbours;
	private WeatherOracle weatherOrcale;
	
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
		return aircrafts;
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
		this.aircrafts = aircraft;
	}
	public void setAirports(List<Airport> airports) {
		this.airports = airports;
	}
	
	public void addAircraft(Aircraft newAircraft) {
		if (aircraftInArea(newAircraft)) {
			this.aircrafts.add(newAircraft);
		}
	}
	
	public boolean removeAircraft(Aircraft aircraft) {
		return this.aircrafts.remove(aircraft);
	}
	
	public void stepSimulator(int currentTime, int timeStep) {
		
		int warning = weatherOrcale.getStormWarning(location, size);
		for (Aircraft a : aircrafts) {
			a.stepSimulator(currentTime, timeStep);
			a.sendStormWarning(warning);
			if (!aircraftInArea(a)) {
				// Tell the neighbours to look for new airplane
				for (Airspace n : neighbours) {
					n.addAircraft(a);
				}
			}
		}
		preditcConflicts();
		
	}
	
	private void preditcConflicts() {
		// TODO Auto-generated method stub
		
	}
	private boolean aircraftInArea(Aircraft a) {
		// TODO Add coordinates and miles :O
		if (a.getLocation().getLatitude() < location.getLatitude() ||  a.getLocation().getLongitude() < location.getLongitude()) {
			return false;
		}
		if (a.getLocation().getLatitude() > location.getLatitude() + size ||  a.getLocation().getLongitude() > location.getLongitude() + size) {
			return false;
		}
		return true; 
	}

}
