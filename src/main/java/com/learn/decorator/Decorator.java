package com.learn.decorator;

public class Decorator extends Drink {
	private Drink drink;

	public Decorator(Drink drink) {
		// TODO Auto-generated constructor stub
		this.drink = drink;
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return super.getPrice() + drink.cost();// ��������+���ȵ��ܼ۸�
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return drink.getDescription() + " ��" + drink.cost() + "�� " + "�������ϣ�" + super.getDescription()
				+ super.getPrice();
	}

}
