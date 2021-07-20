package com.java.design.patterns.Observer2;

public class ObserverPatternTest {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		//It's the topic where whosoevery wants to get notified is registered
		DeliveryData deliveryDataTopic = new DeliveryData();
		
		//These are the Observers. They are wants to get notified.
		Observer seller = new Seller();
		Observer user = new User();
		Observer deliveryWareHouseCenter = new DeliveryWareHouseCenter();
		
		deliveryDataTopic.register(seller);
		deliveryDataTopic.register(user);
		deliveryDataTopic.register(deliveryWareHouseCenter);
		
		deliveryDataTopic.locationChanged();
	}
}
