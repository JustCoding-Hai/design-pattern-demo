package com.learn.facade;

/**
 * 功放设备
 * 
 * @author LENOVO
 *
 */
public class Amplifier {

	private static Amplifier amplifier = new Amplifier();

	public static Amplifier getInstance() {
		return amplifier;
	}

	public void on() {
		System.out.println("打开功放");
	}

	public void off() {
		System.out.println("关闭功放");
	}

	public void setInput(String input) {
		System.out.println("将功放的输入切换成" + input);
	}

}
