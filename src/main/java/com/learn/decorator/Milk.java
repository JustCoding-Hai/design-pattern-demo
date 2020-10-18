package com.learn.decorator;

//具体装饰者——牛奶
public class Milk extends Decorator {

	public Milk(Drink drink) {
		super(drink);
		setDescription("牛奶");
		setPrice(2.4f);
		// TODO Auto-generated constructor stub
	}

}
