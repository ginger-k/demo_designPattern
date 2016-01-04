package com.fccs.dp.behavior.observer;

public class WeatherDataSatation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		TemperatureDisplayer temperatureDisplayer = new TemperatureDisplayer();
		//订阅
		temperatureDisplayer.subscribe(weatherData);
		weatherData.dataChanged(10, 20, 30);
		temperatureDisplayer.display();
		//取消订阅
		temperatureDisplayer.cancel(weatherData);
		weatherData.dataChanged(11, 22, 33);
		temperatureDisplayer.display();
	}
	
}
