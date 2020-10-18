package com.learn.facade;

/**
 * 屏幕类
 * 
 * @author LENOVO
 */
public class Screen {
	private static Screen instance = new Screen();

	public static Screen getInstance() {
		return instance;
	}

	public void down() {
		System.out.println("放下屏幕");
	}

	public void up() {
		System.out.println("拉上屏幕");
	}

}
