package com.learn.adapter.classadapter;

public class Phone {
	public void charging(IVoltage5V iVoltage5V) {
		// TODO Auto-generated method stub
		if (iVoltage5V.output5V() == 5) {
			System.out.println("电压为5V，可以充电");
		} else {
			System.out.println("电压不为5V，不能充电");
		}
	}

}
