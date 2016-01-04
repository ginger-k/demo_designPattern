package com.fccs.dp.behavior.observer;

public interface Subject {
	
	void register(Observer observer);
	void remove(Observer observer);
	void notifyObservers();

}
