package com.appstore.yorknodelays.shared;

import java.util.HashMap;

public class Weather {
	
	private HashMap<Integer,String> test = new HashMap<Integer, String>() {
	    {
	        put(395, "Moderate or heavy snow in area with thunder");
	        put(392, "Patchy light snow in area with thunder");
	        put(389, "Moderate or heavy rain in area with thunder");
	        put(386, "Patchy light rain in area with thunder");
	        put(377, "Moderate or heavy showers of ice pellets");
	        put(374, "Light showers of ice pellets");
	        put(371, "Moderate or heavy snow showers");
	        put(368, "Light snow showers");
	        put(365, "Moderate or heavy sleet showers");
	        put(362, "Light sleet showers");
	        put(359, "Torrential rain shower");
	        put(356, "Moderate or heavy rain shower");
	        put(353, "Light rain shower");
	        put(350, "Ice pellets");
	        put(338, "Heavy snow");
	        put(335, "Patchy heavy snow");
	        put(332, "Moderate snow");
	        put(329, "Patchy moderate snow");
	        put(326, "Light snow");
	        put(323, "Patchy light snow");
	        put(320, "Moderate or heavy sleet");
	        put(317, "Light sleet");
	        put(314, "Moderate or Heavy freezing rain");
	        put(311, "Light freezing rain");
	        put(308, "Heavy rain");
	        put(305, "Heavy rain at times");
	        put(302, "Moderate rain");
	        put(299, "Moderate rain at times");
	        put(296, "Light rain");
	        put(293, "Patchy light rain");
	        put(284, "Heavy freezing drizzle");
	        put(281, "Freezing drizzle");
	        put(266, "Light drizzle");
	        put(263, "Patchy light drizzle");
	        put(260, "Freezing fog");
	        put(248, "Fog");
	        put(230, "Blizzard");
	        put(227, "Blowing snow");
	        put(200, "Thundery outbreaks in nearby");
	        put(185, "Patchy freezing drizzle nearby");
	        put(182, "Patchy sleet nearby");
	        put(179, "Patchy snow nearby");
	        put(176, "Patchy rain nearby");
	        put(143, "Mist");
	        put(122, "Overcast");
	        put(119, "Cloudy");
	        put(116, "Partly Cloudy");
	        put(113, "Clear/Sunny");
	    }
	};


	private float windDirection;
	private float windSpeed; // Wind Speed knots
	private float temperature; // Tempurature Celsius
	private int weather;
	private float precipitation; // Precipitation in mm
	private float humidity;
	private float visibility;
	private float pressure;
	private float clouds;
	
	
	public HashMap<Integer, String> getTest() {
		return test;
	}
	public float getWindDirection() {
		return windDirection;
	}
	public float getWindSpeed() {
		return windSpeed;
	}
	public float getTemperature() {
		return temperature;
	}
	public int getWeather() {
		return weather;
	}
	public float getPrecipitation() {
		return precipitation;
	}
	public float getHumidity() {
		return humidity;
	}
	public float getVisibility() {
		return visibility;
	}
	public float getPressure() {
		return pressure;
	}
	public float getClouds() {
		return clouds;
	}
	public void setTest(HashMap<Integer, String> test) {
		this.test = test;
	}
	public void setWindDirection(float windDirection) {
		this.windDirection = windDirection;
	}
	public void setWindSpeed(float windSpeed) {
		this.windSpeed = windSpeed;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public void setWeather(int weather) {
		this.weather = weather;
	}
	public void setPrecipitation(float precipitation) {
		this.precipitation = precipitation;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	public void setVisibility(float visibility) {
		this.visibility = visibility;
	}
	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	public void setClouds(float clouds) {
		this.clouds = clouds;
	}
			
	

}
