package com.learn.proxy.dynamic;

public class Teacher implements ITeacher {

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("������");

	}

	@Override
	public void check(String name) {
		// TODO Auto-generated method stub
		System.out.println("���" + name + "����ҵ");
	}

}
