package com.learn.facade;

/**
 * 投影机类
 * 
 * @author LENOVO
 *
 */
public class Projector {
	private static Projector instance = new Projector();

	public static Projector getInstance() {
		return instance;
	}

	public void on() {
		System.out.println("打开投影机");
	}

	public void off() {
		System.out.println("关闭投影机");
	}

	public void setInput(String input) {
		System.out.println("将投影仪的输入切换成" + input);
	}
}
