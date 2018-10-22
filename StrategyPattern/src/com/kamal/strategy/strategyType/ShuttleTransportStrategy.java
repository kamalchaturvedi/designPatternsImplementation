package com.kamal.strategy.strategyType;

public class ShuttleTransportStrategy implements TransportStrategy {

	@Override
	public void goToDestination(String destination) {
		System.out.println("Reaching destination " + destination + " via shuttle");
	}

}