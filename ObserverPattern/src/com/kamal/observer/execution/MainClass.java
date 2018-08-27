package com.kamal.observer.execution;

import com.kamal.observer.base.MessageBroker;
import com.kamal.observer.base.MessageSubscriber;

/**
 * @author Kamal Chaturvedi
 *
 */
public class MainClass {
	public static void main(String[] args) {
		MessageBroker broker = new MessageBroker();
		MessageSubscriber sub1 = new MessageSubscriber("Subscriber1");
		MessageSubscriber sub2 = new MessageSubscriber("Subscriber2");
		broker.addNewObserver(sub1);
		broker.addNewObserver(sub2);
		
		// we add the message to the observable and the observer gets the message
		broker.updateNewMessage("Welcome");
		System.out.println(sub1.getMessage()+" "+sub2.getMessage());
	}
}
