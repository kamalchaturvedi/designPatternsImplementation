package com.kamal.strategy.client;

import com.kamal.strategy.context.TransportationContext;
import com.kamal.strategy.strategyType.ShuttleTransportStrategy;
import com.kamal.strategy.strategyType.TaxiTransportStrategy;

public class TransportClient {
	public void setStrategyToReachDestination(String destination, String selection) {
		TransportationContext ctx = new TransportationContext();
		switch (selection) {
		case "Shuttle":
			ctx.setTransportStrategy(new ShuttleTransportStrategy());
			break;
		case "Taxi":
			ctx.setTransportStrategy(new TaxiTransportStrategy());
			break;
		}
		// book the ride now
		ctx.bookTransport(destination);
	}
}