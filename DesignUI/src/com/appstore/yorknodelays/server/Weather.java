package com.appstore.yorknodelays.server;

public class Weather {
	
	private enum weatherCode { snow, rain, sun };
	
	private float windDirection;
	private float windSpeed; // Wind Speed knots
	private float temperature; // Tempurature Celsius
	private weatherCode weather;
	private float precipitation; // Precipitation in mm
	private float humidity;
	private float visibility;
	private float pressure;
	private float clouds;

}
