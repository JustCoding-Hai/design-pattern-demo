package com.learn.fatory.factorymethod.food;

/*
 * 韩国炸鸡
 */
public class FriedChicken extends Food {

	@Override
	public void prepare() {

		System.out.println("准备一只鸡");

	}

	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("放进油锅...");
		System.out.println("制作完成");
	}

}
