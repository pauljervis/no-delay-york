package com.appstore.yorknodelays.server.simulation;

import java.util.ArrayList;
import java.util.List;

import com.appstore.yorknodelays.server.Aircraft;
import com.appstore.yorknodelays.server.Airline;
import com.appstore.yorknodelays.server.Airport;
import com.appstore.yorknodelays.server.Airspace;
import com.appstore.yorknodelays.server.Controller;
import com.appstore.yorknodelays.server.Pilot;

public class AirTrafficSimulation {
	
	private List<Airport> airports = new ArrayList<>();
	private List<Airline> airlines = new ArrayList<>();
	private List<Controller> controllers = new ArrayList<>();
	private List<Airspace> airspaces = new ArrayList<>();
	private List<Pilot> pilots = new ArrayList<>();
	private List<Aircraft> aircrafts = new ArrayList<>();
	
	public AirTrafficSimulation() {
		
	}
	
	public void addAirport(Airport newAirport) {
		airports.add(newAirport);
	}
	
	// TODO Add remove methods
	
	
	public void addAirline(Airline newAirline) {
		airlines.add(newAirline);
	}
	
	public void addController(Controller newController) {
		controllers.add(newController);
	}
	
	public void addAirspace(Airspace newAirspace) {
		airspaces.add(newAirspace);
	}
	
	public void addPilot (Pilot newPilot) {
		pilots.add(newPilot);
	}
	
	public void addAircraft (Aircraft newAircraft) {
		aircrafts.add(newAircraft);
	}
	
	/*
	 * Step the simulator
	 */
    void stepSimulator(int currentTime, int timeStep) {
        // 1. Ask all the planes to move form "timeStep" seconds
    	for (Airspace a : airspaces) {
    		a.stepSimulator(currentTime, timeStep);
    	}
    }
  
}
