package com.appstore.yorknodelays.shared;

import java.util.Date;
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
	private String threeCode;		// Three character Airport Identifier
	private String fourCode;		// Four character Airport Identifier
	private boolean active;
	private Airspace airspace;
	private Runway freeRunway;
	
	/*
	public boolean addAirportToDatabase(String key) {
		
		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		Entity e = new Entity("Airport", key);
		e = addAirportToEntity(e);
		ds.put(e);
		
		return true;
	}
	
	public boolean addAirportToDatabase() {
		
		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		Entity e = new Entity("Airport");
		e = addAirportToEntity(e);
		ds.put(e);
		
		return true;
	}
	
	public Entity addAirportToEntity(Entity e) {
		
		e.setProperty("id", id);
		e.setProperty("weather", weather);
		//TODO: Implement Location.toString() method
		e.setProperty("location", location.toString());
		e.setProperty("name", name);
		e.setProperty("threeCode", threeCode);
		e.setProperty("fourCode", fourCode);
		e.setProperty("active", active);
		
		return e;
	}*/
	
	
	
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
	public void setRoute(List<Route> route) {
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

	public void stepSimulator(int currentTime, int timeStep) {
		// TODO Auto-generated method stub
		for (Airline a : airline) {
			for (Schedule s : a.getSchedules()) {
				for (Flight f : s.getFlights()) {
					if (!f.getOnRoute()) {
						if (f.getDeparture().equals(this)) {
							if (leavesNow(f.getDeparturedate())) {
								// TODO Check that the checklists for the flight are OK
								
								// Check if there is a free runway
								if (isFreeRunway()) {
									Runway r = getFreeRunway();
									Aircraft ac = f.getAircraft(); 
									r.addPlane(ac, r.getTaxiDistance() / ac.getTaxiSpeed());
									airspace.getController().taxi(ac, r);
									f.setOnRoute(true);
									ac.setState(Aircraft.aircaftState.taxi);
								} else {
									// TODO Generate warning of busy airport
								}
							}
						}
					}
				}
			}
		}
		
	}

	private Runway getFreeRunway() {
		// TODO Auto-generated method stub
		return freeRunway;
	}

	private boolean isFreeRunway() {

		for (Runway r : runway) {
			if (!r.isInUse()) {
				if (r.isHeld() && r.getAirline().equals(airline)) {
					freeRunway = r;
					return true;
				} else if (!r.isHeld()) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean leavesNow(Date departuredate) {
		// TODO Compare a Date with seconds??
		
		return false;
	}
	
	

}
