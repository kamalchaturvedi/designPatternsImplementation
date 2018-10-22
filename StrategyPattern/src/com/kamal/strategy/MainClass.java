package com.kamal.strategy;

import com.kamal.strategy.client.TransportClient;

public class MainClass {

	public static void main(String[] args) {
		TransportClient client = new TransportClient();
		client.setStrategyToReachDestination("Denver", "Shuttle");
		client.setStrategyToReachDestination("26th Street", "Taxi");
	}

}
