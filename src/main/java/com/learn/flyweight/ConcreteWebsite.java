package com.learn.flyweight;

public class ConcreteWebsite extends Website {

	private String type = "";// ��վ������ʽ

	public ConcreteWebsite(String type) {
		super();
		this.type = type;
	}

	@Override
	public void use(User user) {
		// TODO Auto-generated method stub
		System.out.println("��վ������ʽ��" + type + "��ʹ���ߣ�" + user.getName());
	}

}
