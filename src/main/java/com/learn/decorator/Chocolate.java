package com.learn.decorator;

//具体装饰者——巧克力
public class Chocolate extends Decorator {

	public Chocolate(Drink drink) {
		super(drink);
		setDescription("巧克力");
		setPrice(1.2f);

		// TODO Auto-generated constructor stub
	}

}
