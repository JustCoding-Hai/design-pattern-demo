package com.learn.decorator;

//����װ���ߡ����ɿ���
public class Chocolate extends Decorator {

	public Chocolate(Drink drink) {
		super(drink);
		setDescription("�ɿ���");
		setPrice(1.2f);

		// TODO Auto-generated constructor stub
	}

}
