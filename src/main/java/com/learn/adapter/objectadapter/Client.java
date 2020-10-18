package com.learn.adapter.objectadapter;

//客户类
public class Client {
	public static void main(String[] args) {
		System.out.println("接口适配器模式");
		Phone phone = new Phone();
		phone.charging(new VoltageAdapter(new Voltage220V()));
	}

}
