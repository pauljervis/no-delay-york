package com.appstore.yorknodelays.server;

import com.appstore.yorknodelays.client.FlightService;

public class FlightServiceImpl implements FlightService {

	@Override
	public String greetServer(String name) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*public boolean addFlightToDatabase(String key) {
	
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
	*/

}
