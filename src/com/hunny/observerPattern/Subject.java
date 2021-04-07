package com.hunny.observerPattern;

public interface Subject {
	void subscribe(Observer o);
	void unSubscribe(Observer o);
	void notifyObservers();
}
