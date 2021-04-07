package com.hunny.observerPattern;

public class YouTube {
	public static void main(String...args) {
		YouTuber youtuber = new YouTuber();
		Hunny hunny = new Hunny(youtuber);
		Kamal kamal = new Kamal(youtuber);
		Sahil sahil = new Sahil(youtuber);
		youtuber.uploadVido("Hey here is my new video");
		youtuber.uploadVido("Hey here is my another video");
	}
}
