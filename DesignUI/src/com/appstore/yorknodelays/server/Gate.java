package com.appstore.yorknodelays.server;


public class Gate {

	private int gateNumber;
	private String name;
	private String id;
	private String airline;
	private Route route;
	private Schedule scheduledFlight;
	private int prepTime;
	private int cleanupTime;
	private boolean active;
	private int delay;
	private Aircraft aircraft;
	private boolean inUse;
	private boolean held;
	
	/*
	public boolean addGateToDatabase(String key) {
		
		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		Entity e = new Entity("Gate", key);
		e = addGateToEntity(e);
		ds.put(e);
		
		return true;
	}
	
	public boolean addGateToDatabase() {
		
		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		Entity e = new Entity("Gate");
		e = addGateToEntity(e);
		ds.put(e);
		
		return true;
	}
	
	public Entity addGateToEntity(Entity e) {
		
		e.setProperty("id", this.id);
		e.setProperty("name", this.name);
		e.setProperty("number", this.gateNumber);
		e.setProperty("airline", this.airline);
		e.setProperty("route", this.route.getId());
		e.setProperty("scheduledFlight", this.scheduledFlight);
		e.setProperty("prepTime", this.prepTime);
		e.setProperty("cleanupTime", this.cleanupTime);
		e.setProperty("active", this.active);
		e.setProperty("delay", this.delay);
		e.setProperty("inUse", this.inUse);
		e.setProperty("held", this.held);
		
		return e;
	}
	*/
	
	public int getGateNumber() {
		return gateNumber;
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public String getAirline() {
		return airline;
	}
	public Route getRoute() {
		return route;
	}
	public Schedule getScheduledFlight() {
		return scheduledFlight;
	}
	public int getPrepTime() {
		return prepTime;
	}
	public int getCleanupTime() {
		return cleanupTime;
	}
	public boolean isActive() {
		return active;
	}
	public int getDelay() {
		return delay;
	}
	public Aircraft getAircraft() {
		return aircraft;
	}
	public boolean isInUse() {
		return inUse;
	}
	public boolean isHeld() {
		return held;
	}
	public void setNumber(int number) {
		this.gateNumber = number;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public void setRoute(Route route) {
		this.route = route;
	}
	public void setScheduledFlight(Schedule scheduledFlight) {
		this.scheduledFlight = scheduledFlight;
	}
	public void setPrepTime(int prepTime) {
		this.prepTime = prepTime;
	}
	public void setCleanupTime(int cleanupTime) {
		this.cleanupTime = cleanupTime;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public void setDelay(int delay) {
		this.delay = delay;
	}
	public void setAircraft(Aircraft aircraft) {
		this.aircraft = aircraft;
	}
	public void setInUse(boolean inUse) {
		this.inUse = inUse;
	}
	public void setHeld(boolean held) {
		this.held = held;
	}
	
}
