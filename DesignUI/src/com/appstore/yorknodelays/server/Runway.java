package com.appstore.yorknodelays.server;

import java.util.List;

public class Runway {
	
	private Airport airport;
	private float bearing1;
	private float bearing2;
	private Weather weather;
	private boolean active;
	private boolean inUse;
	private boolean held;
	private int cleanTime;
	private List<Airline> airline;

	public Airport getAirport() {
		return airport;
	}
	public void setAirport(Airport airport) {
		this.airport = airport;
	}
	public float getBearing1() {
		return bearing1;
	}
	public void setBearing1(float bearing1) {
		this.bearing1 = bearing1;
	}
	public float getBearing2() {
		return bearing2;
	}
	public void setBearing2(float bearing2) {
		this.bearing2 = bearing2;
	}
	public Weather getWeather() {
		return weather;
	}
	public void setWeather(Weather weather) {
		this.weather = weather;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public boolean isInUse() {
		return inUse;
	}
	public void setInUse(boolean inUse) {
		this.inUse = inUse;
	}
	public boolean isHeld() {
		return held;
	}
	public void setHeld(boolean held) {
		this.held = held;
	}
	public int getCleanTime() {
		return cleanTime;
	}
	public void setCleanTime(int cleanTime) {
		this.cleanTime = cleanTime;
	}
	public List<Airline> getAirline() {
		return airline;
	}
	public void setAirline(List<Airline> airline) {
		this.airline = airline;
	}
	
}
