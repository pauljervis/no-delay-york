package com.appstore.yorknodelays.server;

import java.util.Date;

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
	private float bearing;
	private int departureTime;
	
	
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
	
	
	

	
}
