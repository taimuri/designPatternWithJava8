package com.practice.observer;

import java.util.ArrayList;
import java.util.List;

public class Feed implements Subject {

	List<Observer> observers = new ArrayList<Observer>();

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void notifyObservers(String tweet) {
		observers.forEach(o -> o.notify(tweet));
	}

}
