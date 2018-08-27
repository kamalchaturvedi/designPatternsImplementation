package com.kamal.proxy.execution;

import com.kamal.proxy.connectionProxy.ProxyConnector;

public class MainClass {
	public static void main(String[] args) {
		ProxyConnector connector = new ProxyConnector();
		connector.connectToInternet("google.com");
		connector.connectToInternet("xv.com");
		connector.connectToInternet("kam.com");
	}
}
