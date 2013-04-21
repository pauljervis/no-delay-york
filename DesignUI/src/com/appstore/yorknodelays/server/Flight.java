package com.appstore.yorknodelays.server;

import java.util.Date;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

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
	private boolean onRoute;
	
	public boolean addFlightToDatabase(String key) {
		
		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		Entity e = new Entity("Flight", key);
		e = addFlightToEntity(e);
		ds.put(e);
		
		return true;
	}
	
	public boolean addFlightToDatabase() {
		
		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		Entity e = new Entity("Flight");
		e = addFlightToEntity(e);
		ds.put(e);
		
		return true;
	}
	
	public Entity addFlightToEntity(Entity e) {
		
		e.setProperty("id", id);
		e.setProperty("departure", departure);
		e.setProperty("destination", destination);
		e.setProperty("departuredate", departuredate);
		e.setProperty("etaDate", etaDate);
		e.setProperty("flightDuration", flightDuration);
		e.setProperty("airline", airline);
		e.setProperty("aircraft", aircraft);
		e.setProperty("remark", remark);
		
		return e;
	}
	
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public boolean getOnRoute() {
		return this.onRoute;
	}

	public void setOnRoute(boolean onRoute) {
		this.onRoute = onRoute;
	}
	
	
	
	
}
