package com.learn.adapter.objectadapter;

//适配器类
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
			int srcV = voltage220V.output220V();// 获取220V电压
			dstV = srcV / 44;// 转换成5V
			System.out.println("电压转为5V");
			return dstV;

		}
		return dstV;
	}

}
