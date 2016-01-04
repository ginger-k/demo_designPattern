package com.fccs.dp.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

	private List<Observer> observers;
	private float temperature;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void register(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void remove(Observer observer) {
		int indexOf = observers.indexOf(observer);
		if (indexOf >= 0) {
			observers.remove(observer);
		}
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i ++) {
			Observer observer = observers.get(i);
			observer.update(this);
		}
	}
	
	
	public void dataChanged(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.pressure = pressure;
		notifyObservers();
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public float getTemperature() {
		return temperature;
	}

	public float getPressure() {
		return pressure;
	}

}
