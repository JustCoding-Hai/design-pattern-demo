package com.learn.adapter.objectadapter;

//�ͻ���
public class Client {
	public static void main(String[] args) {
		System.out.println("�ӿ�������ģʽ");
		Phone phone = new Phone();
		phone.charging(new VoltageAdapter(new Voltage220V()));
	}

}
