package com.appstore.yorknodelays.shared;

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
	

	
}
