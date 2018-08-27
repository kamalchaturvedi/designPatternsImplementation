package com.kamal.proxy.connection;

public class InternetConnectorImpl implements InternetConnector {

	@Override
	public void connectToInternet(String website) {
		System.out.println("Connecting to site : " + website);
	}

}
