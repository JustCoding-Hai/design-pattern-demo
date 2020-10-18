package com.learn.fatory.factorymethod.food;

public class HotDryNoodles extends Food {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("准备面条");

	}

	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("煮熟面条");
		System.out.println("制作完成");
	}

}
