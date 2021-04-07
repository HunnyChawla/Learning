package com.hunny.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class YouTuber implements Subject {

	private List<Observer> subscribers;
	private String videoLink;
	private String message;
	YouTuber(){
		subscribers = new ArrayList<>();
	}
	@Override
	public void subscribe(Observer o) {
		// TODO Auto-generated method stub
		subscribers.add(o);
		
	}

	@Override
	public void unSubscribe(Observer o) {
		// TODO Auto-generated method stub
		subscribers.remove(o);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer subscriber : subscribers) {
			subscriber.update(videoLink, message);
		}
	}

	public void uploadVido(String message) {
		// code to upload the video on server
		this.videoLink = "Some link";
		this.message=message;
		notifyObservers();
	}
}
