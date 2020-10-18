package com.learn.fatory.simplefactory.order;

public class Restaurant {
	public static void main(String[] args) {
		FoodOrder foodOrder = new FoodOrder();
		foodOrder.acceptOrder(new SimpleFactory());
	}

}
