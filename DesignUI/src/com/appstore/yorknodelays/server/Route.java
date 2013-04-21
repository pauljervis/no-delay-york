package com.appstore.yorknodelays.server;

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
	private Airzone airzoneIntersected;
	private boolean active;
	
	public void setName(String name)					{ this.name = name; }
	public void setId(String id) 						{ this.id = id; }
	public void setAirline(Airline airline)				{ this.airline = airline; }
	public void setJourneyDistance(float distance)		{ this.journeyDistance = distance; }
	public void setJourneyTime(int journeyTime)			{ this.journeyTime = journeyTime; }
	public void setSourceAirport(Airport airport)		{ this.sourceAirport = airport; }
	public void setSourceGate(Gate gate)				{ this.sourceGate = gate; }
	public void setDestinationAirport(Airport airport)	{ this.destinationAirport = airport; }
	public void setDestinationGate(Gate gate)			{ this.destinationGate = gate; }
	public void setWeather(Weather weather)				{ this.weather = weather; }
	public void setAirzoneIntersected(Airzone airzone)	{ this.airzoneIntersected = airzone; }
	public void setActive(boolean active)				{ this.active = active; }
	
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
	public Airzone getAirzoneIntersected() {
		return airzoneIntersected;
	}
	public boolean isActive() {
		return active;
	}
	
	
	
}
