package com.learn.adapter.classadapter;

public class Phone {
	public void charging(IVoltage5V iVoltage5V) {
		// TODO Auto-generated method stub
		if (iVoltage5V.output5V() == 5) {
			System.out.println("��ѹΪ5V�����Գ��");
		} else {
			System.out.println("��ѹ��Ϊ5V�����ܳ��");
		}
	}

}
