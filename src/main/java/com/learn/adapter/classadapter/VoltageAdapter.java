package com.learn.adapter.classadapter;

//适配器类
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

	@Override
	public int output5V() {
		// TODO Auto-generated method stub
		int srcV = output220V();// 获取220V电压
		int dstV = srcV / 44;// 转换成5V
		System.out.println("电压转为5V");
		return dstV;
	}

}
