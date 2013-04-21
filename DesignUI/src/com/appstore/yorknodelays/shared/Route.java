package com.appstore.yorknodelays.shared;

import java.util.List;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

public class Route {

	private String name;
	private String id;
	private Airline airline;
	private float journeyDistance;  // Journey distance in miles
	private int journeyTime;
	private Airport sourceAirport;
	private Gate sourceGate;
	private Airport destinationAirport;
	private Gate destinationGate;
	private Weather weather;
	private List<Airspace> airspaceIntersected;
	private boolean active;
	
	public boolean addRouteToDatabase(String key) {
		
		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		Entity e = new Entity("Route", key);
		e = addRouteToEntity(e);
		ds.put(e);
		
		return true;
	}
	
	public boolean addRouteToDatabase() {
		
		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		Entity e = new Entity("Route");
		e = addRouteToEntity(e);
		ds.put(e);
		
		return true;
	}
	
	public Entity addRouteToEntity(Entity e) {
		
		e.setProperty("id", id);
		e.setProperty("airline", airline);
		e.setProperty("journeyDistance", journeyDistance);		// Journey distance in miles
		e.setProperty("journeyTime", journeyTime);
		e.setProperty("sourceAirport", sourceAirport);
		e.setProperty("sourceGate", sourceGate);
		e.setProperty("destinationAirport", destinationAirport);
		e.setProperty("destinationGate", destinationGate);
		e.setProperty("weather", weather);
		e.setProperty("airspaceIntersected", airspaceIntersected);
		e.setProperty("active", active);
		
		return e;
	}
	
	public void setName(String name)							{ this.name = name; }
	public void setId(String id) 								{ this.id = id; }
	public void setAirline(Airline airline)						{ this.airline = airline; }
	public void setJourneyDistance(float distance)				{ this.journeyDistance = distance; }
	public void setJourneyTime(int journeyTime)					{ this.journeyTime = journeyTime; }
	public void setSourceAirport(Airport airport)				{ this.sourceAirport = airport; }
	public void setSourceGate(Gate gate)						{ this.sourceGate = gate; }
	public void setDestinationAirport(Airport airport)			{ this.destinationAirport = airport; }
	public void setDestinationGate(Gate gate)					{ this.destinationGate = gate; }
	public void setWeather(Weather weather)						{ this.weather = weather; }
	public void setAirspaceIntersected(List<Airspace> airspace)	{ this.airspaceIntersected = airspace; }
	public void setActive(boolean active)						{ this.active = active; }
	
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public Airline getAirline() {
		return airline;
	}
	public float getJourneyDistance() {
		return journeyDistance;
	}
	public int getJourneyTime() {
		return journeyTime;
	}
	public Airport getSourceAirport() {
		return sourceAirport;
	}
	public Gate getSourceGate() {
		return sourceGate;
	}
	public Airport getDestinationAirport() {
		return destinationAirport;
	}
	public Gate getDestinationGate() {
		return destinationGate;
	}
	public Weather getWeather() {
		return weather;
	}
	public List<Airspace> getAirspaceIntersected() {
		return airspaceIntersected;
	}
	public boolean isActive() {
		return active;
	}
	
	
	
}
