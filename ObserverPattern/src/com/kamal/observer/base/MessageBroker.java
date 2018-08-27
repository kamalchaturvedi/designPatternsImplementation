package com.kamal.observer.base;

import java.util.ArrayList;
import java.util.List;
/**
 * @author Kamal Chaturvedi
 *
 */
public class MessageBroker {
	List<MessageSubscriber> observers;
	{
		observers = new ArrayList<>();
	}

	public void addNewObserver(MessageSubscriber subscriber) {
		observers.add(subscriber);
	}
	public void updateNewMessage(String newMessage) {
		for(MessageSubscriber subscriber : observers) {
			subscriber.updateNewMessage(newMessage);
		}
	}
}
