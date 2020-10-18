package com.learn.fatory.abstractfactory.order;

public class Restaurant {
	public static void main(String[] args) {
		FoodOrder foodOrder = new FoodOrder();
		foodOrder.acceptOrder(new CHNFactory());
	}

}
