package com.learn.flyweight;

public class ConcreteWebsite extends Website {

	private String type = "";// 网站发布形式

	public ConcreteWebsite(String type) {
		super();
		this.type = type;
	}

	@Override
	public void use(User user) {
		// TODO Auto-generated method stub
		System.out.println("网站发布形式：" + type + "。使用者：" + user.getName());
	}

}
