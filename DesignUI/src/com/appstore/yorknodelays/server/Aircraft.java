package com.appstore.yorknodelays.server;

import java.util.Date;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

public class Aircraft {
	
	private float fuelCapacity;		// Fuel capacity in Galons
	private int refuleTime;			// Refuel time in seconds
	private int averageSpeedClimb;
	private int averageSpeedCruise;
	private int averageSpeedDescent;
	private int maxSpeedClimb;
	private int maxSpeedCruise;
	private int maxSpeedDescent;
	private String name;			// AX-809
	private String manufacturer;
	private String type;
	private String model;
	private int engines;
	private float hourlyRunningCost;
	private int staffCapacity;
	private int passangerCapacity;
	private float averageTakeoffCost;
	private float range;			// Miles
	private float lenght;
	private int cargoCapacity;
	private int maxAltitude;		// feet
	private Pilot pilot;
	private Controller controller;
	private boolean active;
	private Date commissionDate;
	private Date nextService;
	private int prepTime;			// Time to prepare the plane to fly again, seconds
	private int flightTime;
	private Location location;
	private float bearing;			// Degrees
	private int departureTime;
	private int currentSpeed;
	private int tripTime;
	
	
	public float getFuelCapacity() {
		return fuelCapacity;
	}
	public int getRefuleTime() {
		return refuleTime;
	}
	public int getAverageSpeedClimb() {
		return averageSpeedClimb;
	}
	public int getAverageSpeedCruise() {
		return averageSpeedCruise;
	}
	public int getAverageSpeedDescent() {
		return averageSpeedDescent;
	}
	public int getMaxSpeedClimb() {
		return maxSpeedClimb;
	}
	public int getMaxSpeedCruise() {
		return maxSpeedCruise;
	}
	public int getMaxSpeedDescent() {
		return maxSpeedDescent;
	}
	public String getName() {
		return name;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public String getType() {
		return type;
	}
	public String getModel() {
		return model;
	}
	public int getEngines() {
		return engines;
	}
	public float getHourlyRunningCost() {
		return hourlyRunningCost;
	}
	public int getStaffCapacity() {
		return staffCapacity;
	}
	public int getPassangerCapacity() {
		return passangerCapacity;
	}
	public float getAverageTakeoffCost() {
		return averageTakeoffCost;
	}
	public float getRange() {
		return range;
	}
	public float getLenght() {
		return lenght;
	}
	public int getCargoCapacity() {
		return cargoCapacity;
	}
	public int getMaxAltitude() {
		return maxAltitude;
	}
	public Pilot getPilot() {
		return pilot;
	}
	public Controller getController() {
		return controller;
	}
	public boolean isActive() {
		return active;
	}
	public Date getCommissionDate() {
		return commissionDate;
	}
	public Date getNextService() {
		return nextService;
	}
	public int getPrepTime() {
		return prepTime;
	}
	public void setFuelCapacity(float fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public void setRefuleTime(int refuleTime) {
		this.refuleTime = refuleTime;
	}
	public void setAverageSpeedClimb(int averageSpeedClimb) {
		this.averageSpeedClimb = averageSpeedClimb;
	}
	public void setAverageSpeedCruise(int averageSpeedCruise) {
		this.averageSpeedCruise = averageSpeedCruise;
	}
	public void setAverageSpeedDescent(int averageSpeedDescent) {
		this.averageSpeedDescent = averageSpeedDescent;
	}
	public void setMaxSpeedClimb(int maxSpeedClimb) {
		this.maxSpeedClimb = maxSpeedClimb;
	}
	public void setMaxSpeedCruise(int maxSpeedCruise) {
		this.maxSpeedCruise = maxSpeedCruise;
	}
	public void setMaxSpeedDescent(int maxSpeedDescent) {
		this.maxSpeedDescent = maxSpeedDescent;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setEngines(int engines) {
		this.engines = engines;
	}
	public void setHourlyRunningCost(float hourlyRunningCost) {
		this.hourlyRunningCost = hourlyRunningCost;
	}
	public void setStaffCapacity(int staffCapacity) {
		this.staffCapacity = staffCapacity;
	}
	public void setPassangerCapacity(int passangerCapacity) {
		this.passangerCapacity = passangerCapacity;
	}
	public void setAverageTakeoffCost(float averageTakeoffCost) {
		this.averageTakeoffCost = averageTakeoffCost;
	}
	public void setRange(float range) {
		this.range = range;
	}
	public void setLenght(float lenght) {
		this.lenght = lenght;
	}
	public void setCargoCapacity(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}
	public void setMaxAltitude(int maxAltitude) {
		this.maxAltitude = maxAltitude;
	}
	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}
	public void setController(Controller controller) {
		this.controller = controller;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public void setCommissionDate(Date commissionDate) {
		this.commissionDate = commissionDate;
	}
	public void setNextService(Date nextService) {
		this.nextService = nextService;
	}
	public void setPrepTime(int prepTime) {
		this.prepTime = prepTime;
	}
	public int getFlightTime() {
		return flightTime;
	}
	public float getBearing() {
		return bearing;
	}
	public int getDepartureTime() {
		return departureTime;
	}
	public void setFlightTime(int flightTime) {
		this.flightTime = flightTime;
	}
	public void setBearing(float bearing) {
		this.bearing = bearing;
	}
	public void setDepartureTime(int departureTime) {
		this.departureTime = departureTime;
	}
	
	
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	public int getTripTime() {
		return tripTime;
	}
	public void setTripTime(int tripTime) {
		this.tripTime = tripTime;
	}
	
	
	public boolean addAircraftToDatabase(String key) {
		
		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		Entity e = new Entity("Aircraft", key);
		e = addAircraftToEntity(e);
		ds.put(e);
		
		return true;
	}
	
	public boolean addAircraftToDatabase() {
		
		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		Entity e = new Entity("Aircraft");
		e = addAircraftToEntity(e);
		ds.put(e);
		
		return true;
	}
	
	public Entity addAircraftToEntity(Entity e) {
		
		e.setProperty("fuelCapacity", fuelCapacity);
		e.setProperty("refuelTime", refuleTime);
		e.setProperty("averageSpeedClimb", averageSpeedClimb);
		e.setProperty("averageSpeedCruise",averageSpeedCruise);
		e.setProperty("averageSpeedDescent",averageSpeedDescent);
		e.setProperty("maxSpeedClimb",maxSpeedClimb);
		e.setProperty("maxSpeedCruise", maxSpeedCruise);
		e.setProperty("maxSpeedDescent", maxSpeedDescent);
		e.setProperty("name", name);
		e.setProperty("manufacturer", manufacturer);
		e.setProperty("type", type);
		e.setProperty("model", model);
		e.setProperty("engines", engines);
		e.setProperty("hourlyRunningCost", hourlyRunningCost);
		e.setProperty("staffCapacity", staffCapacity);
		e.setProperty("passangerCapacity", passangerCapacity);
		e.setProperty("averageTakeoffCost", averageTakeoffCost);
		e.setProperty("range", range);
		e.setProperty("lenght", lenght);
		e.setProperty("cargoCapacity", cargoCapacity);
		e.setProperty("maxAltitude", maxAltitude);
		e.setProperty("active", active);
		e.setProperty("commissionDate", commissionDate);
		e.setProperty("nextService", nextService);
		e.setProperty("prepTime", prepTime);
		e.setProperty("flightTime", flightTime);
		e.setProperty("bearing", bearing);
		e.setProperty("departureTime", departureTime);
		
		return e;
	}
	
	public void stepSimulator(int currentTime, int timeStep) {
		/*# Can we use some randomness to do the speed variation due to weather/load etc?
	        # This method only estimates the airplanes predicted position.. I think the
	        # algorithm needs a position, a speed, and a direction, and the angle between
	        # the actual direction and the desired direction?
	        */
	        
	        // In order to have 0 degrees at north and move clock-wise, x is the adjacent and y
	        // is the opposite
		double newLatitud = Math.sin(this.bearing*Math.PI/180)*this.currentSpeed * timeStep/3600;
		double newLongitud = Math.cos(this.bearing*Math.PI/180)*this.currentSpeed * timeStep/3600;
		this.location.setLatitude(newLatitud);
		this.location.setLongitude(newLongitud);
		this.tripTime += timeStep;
	}
	
	public void sendStormWarning(int warning) {
		// TODO Auto-generated method stub
		
	}
	
	
}
