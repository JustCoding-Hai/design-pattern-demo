package com.learn.fatory.factorymethod.food;

/*
 * ����ը��
 */
public class FriedChicken extends Food {

	@Override
	public void prepare() {

		System.out.println("׼��һֻ��");

	}

	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("�Ž��͹�...");
		System.out.println("�������");
	}

}
