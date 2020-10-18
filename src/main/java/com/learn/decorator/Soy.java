package com.learn.decorator;

//具体装饰者——豆浆
public class Soy extends Decorator {

	public Soy(Drink drink) {
		super(drink);
		setDescription("豆浆");
		setPrice(2.3f);
		// TODO Auto-generated constructor stub
	}

}
