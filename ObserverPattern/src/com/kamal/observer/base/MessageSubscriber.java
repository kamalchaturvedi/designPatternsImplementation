package com.kamal.observer.base;
/**
 * @author Kamal Chaturvedi
 *
 */
public class MessageSubscriber {
	String subscriberId;
	String message;
	public MessageSubscriber(String subscriberId) {
		this.subscriberId = subscriberId;
	}
	public void updateNewMessage(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
}
