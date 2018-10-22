package com.kamal.strategy.strategyType;

public class TaxiTransportStrategy implements TransportStrategy {

	@Override
	public void goToDestination(String destination) {
		System.out.println("Reaching destination " + destination + " via taxi");
	}

}
