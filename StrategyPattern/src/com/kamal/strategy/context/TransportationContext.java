package com.kamal.strategy.context;

import com.kamal.strategy.strategyType.TransportStrategy;

public class TransportationContext {
	private TransportStrategy strategy;

	// this will be set at run-time
	public void setTransportStrategy(TransportStrategy strategy) {
		this.strategy = strategy;
	}

	// use the decided strategy
	public void bookTransport(String destination) {
		strategy.goToDestination(destination);
	}
}
