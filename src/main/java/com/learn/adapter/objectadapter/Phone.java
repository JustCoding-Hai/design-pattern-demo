package com.learn.adapter.objectadapter;

public class Phone {
	public void charging(IVoltage5V iVoltage5V) {
		// TODO Auto-generated method stub
		if (iVoltage5V.output5V() == 5) {
			System.out.println("��ѹΪ5�����Գ��");
		} else {
			System.out.println("��ѹ��Ϊ5�����ܳ��");
		}
	}

}
