package com.learn.facade;

/**
 * ͶӰ����
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
		System.out.println("��ͶӰ��");
	}

	public void off() {
		System.out.println("�ر�ͶӰ��");
	}

	public void setInput(String input) {
		System.out.println("��ͶӰ�ǵ������л���" + input);
	}
}
