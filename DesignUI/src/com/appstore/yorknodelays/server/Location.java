package com.appstore.yorknodelays.server;

public class Location {
	
	private float timezone;
	private String DST; // Daylight Savings Time or not
	private float longitude;
	private float latitude;
	private float altitude;
	
	public float getTimezone() {
		return timezone;
	}
	public String getDST() {
		return DST;
	}
	public float getLongitude() {
		return longitude;
	}
	public float getLatitude() {
		return latitude;
	}
	public float getAltitude() {
		return altitude;
	}
	public void setTimezone(float timezone) {
		this.timezone = timezone;
	}
	public void setDST(String dST) {
		DST = dST;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	public void setAltitude(float altitude) {
		this.altitude = altitude;
	}
	
	

}
