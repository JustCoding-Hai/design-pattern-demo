package com.learn.fatory.abstractfactory.food;

/*
 * 北京烤鸭
 */
public class PekingDuck extends Food {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("准备一只鸭");

	}

	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("将鸭放进烤炉");
		System.out.println("制作完成");
	}

}
