package com.learn.adapter.objectadapter;

//��������
public class VoltageAdapter implements IVoltage5V {
	private Voltage220V voltage220V;

	public VoltageAdapter(Voltage220V voltage220V) {
		// TODO Auto-generated constructor stub
		this.voltage220V = voltage220V;
	}

	@Override
	public int output5V() {
		// TODO Auto-generated method stub
		int dstV = 0;
		if (voltage220V != null) {
			int srcV = voltage220V.output220V();// ��ȡ220V��ѹ
			dstV = srcV / 44;// ת����5V
			System.out.println("��ѹתΪ5V");
			return dstV;

		}
		return dstV;
	}

}
