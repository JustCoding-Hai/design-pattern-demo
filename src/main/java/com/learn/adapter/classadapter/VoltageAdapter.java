package com.learn.adapter.classadapter;

//��������
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

	@Override
	public int output5V() {
		// TODO Auto-generated method stub
		int srcV = output220V();// ��ȡ220V��ѹ
		int dstV = srcV / 44;// ת����5V
		System.out.println("��ѹתΪ5V");
		return dstV;
	}

}
