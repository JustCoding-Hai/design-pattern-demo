package com.learn.decorator;

public class Coffee extends Drink {

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return super.getPrice();// 自身价格
	}

}
