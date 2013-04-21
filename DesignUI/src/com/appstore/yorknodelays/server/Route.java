package com.appstore.yorknodelays.server;

public class Route {

	private String name;
	private String id;
	private Airline airline;
	private float journeyDistance;  // Journey distance in miles
	private float journeyTime;
	private Airport sourceAirport;
	private Gate sourceGate;
	private Airport destinationAirport;
	private Gate destinationGate;
	private Weather weather;
	private Airzone airzoneIntersected;
	private boolean active;
	
}
