package com.fccs.dp.behavior.observer;

public class TemperatureDisplayer implements Observer {

	private Float temperature;
	
	public void subscribe(Subject subject) {
		subject.register(this);
	}
	
	public void cancel(Subject subject) {
		subject.remove(this);
		temperature = null;
	}
	
	@Override
	public void update(Subject subject) {
		if (subject instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) subject;
			this.temperature = weatherData.getTemperature();
		}
	}
	
	//温度更新和显示分开，可以给显示加定时
	public void display() {
		if (temperature != null) {
			System.out.println("显示温度: " + this.temperature + "℃");
		}
	}
	

}
