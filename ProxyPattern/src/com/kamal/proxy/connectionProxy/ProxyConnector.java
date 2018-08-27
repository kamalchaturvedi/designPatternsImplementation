package com.kamal.proxy.connectionProxy;

import java.util.ArrayList;
import java.util.List;
import com.kamal.proxy.connection.InternetConnector;
import com.kamal.proxy.connection.InternetConnectorImpl;
/**
 * @author Kamal Chaturvedi
 *
 */
public class ProxyConnector implements InternetConnector {
	InternetConnector internetConnector = new InternetConnectorImpl();
	private List<String> bannedWebsites;
	{
		bannedWebsites = new ArrayList<String>();
		bannedWebsites.add("xv.com");
		bannedWebsites.add("ph.com");
		bannedWebsites.add("at.com");
		bannedWebsites.add("sb.com");
	}

	@Override
	public void connectToInternet(String website) {
		if (bannedWebsites.contains(website)) {
			try {
				throw new Exception("Access Denied");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} else {
			internetConnector.connectToInternet(website);
		}
	}

}
