package com.learn.facade;

/**
 * �����豸
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
		System.out.println("�򿪹���");
	}

	public void off() {
		System.out.println("�رչ���");
	}

	public void setInput(String input) {
		System.out.println("�����ŵ������л���" + input);
	}

}
