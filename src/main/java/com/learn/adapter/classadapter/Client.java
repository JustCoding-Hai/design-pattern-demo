package com.learn.adapter.classadapter;

//�ͻ���
public class Client {
	public static void main(String[] args) {
		System.out.println("��������ģʽ");
		Phone phone = new Phone();
		phone.charging(new VoltageAdapter());
	}

}
