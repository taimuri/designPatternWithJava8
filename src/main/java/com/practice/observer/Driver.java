package com.practice.observer;

public class Driver {

	public static void main(String[] args) {
		Feed feed = new Feed();

		feed.registerObserver(new NYTimes());
		feed.registerObserver(new Guardian());
		feed.registerObserver(new LeMonde());

		feed.notifyObservers("The queen said her favorite book is Java 8");
		
		feed.registerObserver((String tweet) -> {
			if (tweet != null && !tweet.contains("money")) {
				System.out.println("Breaking news: " + tweet);
			}
		});
	}
}
