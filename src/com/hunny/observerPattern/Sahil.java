package com.hunny.observerPattern;

public class Sahil implements Observer{

	Sahil(Subject youtuber){
		youtuber.subscribe(this);
	}
	@Override
	public void update(String videoLink, String message) {
		// TODO Auto-generated method stub
		System.out.println("New Video Uploaded");
		System.out.println("video link :"+ videoLink);
		System.out.println(message);
	}

}
