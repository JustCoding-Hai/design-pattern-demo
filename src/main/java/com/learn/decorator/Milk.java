package com.learn.decorator;

//����װ���ߡ���ţ��
public class Milk extends Decorator {

	public Milk(Drink drink) {
		super(drink);
		setDescription("ţ��");
		setPrice(2.4f);
		// TODO Auto-generated constructor stub
	}

}
