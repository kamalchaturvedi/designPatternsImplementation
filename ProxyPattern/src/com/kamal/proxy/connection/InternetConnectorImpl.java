package com.kamal.proxy.connection;
/**
 * @author Kamal Chaturvedi
 *
 */
public class InternetConnectorImpl implements InternetConnector {

	@Override
	public void connectToInternet(String website) {
		System.out.println("Connecting to site : " + website);
	}

}
