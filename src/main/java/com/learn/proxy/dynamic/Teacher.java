package com.learn.proxy.dynamic;

public class Teacher implements ITeacher {

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("教书中");

	}

	@Override
	public void check(String name) {
		// TODO Auto-generated method stub
		System.out.println("检查" + name + "的作业");
	}

}
