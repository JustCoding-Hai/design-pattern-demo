package com.learn.fatory.abstractfactory.food;

/*
 * 韩国泡菜
 */
public class KimChi extends Food {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("准备菜");
	}

	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("放进罐子里");
		System.out.println("制作完成");

	}

}
