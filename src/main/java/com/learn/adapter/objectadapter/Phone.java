package com.learn.adapter.objectadapter;

public class Phone {
	public void charging(IVoltage5V iVoltage5V) {
		// TODO Auto-generated method stub
		if (iVoltage5V.output5V() == 5) {
			System.out.println("电压为5，可以充电");
		} else {
			System.out.println("电压不为5，不能充电");
		}
	}

}
