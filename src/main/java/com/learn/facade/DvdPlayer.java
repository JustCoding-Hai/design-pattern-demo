package com.learn.facade;

/**
 * DVD������
 * 
 * @author LENOVO
 *
 */
public class DvdPlayer {

	private static DvdPlayer dvdPlayer = new DvdPlayer();

	public static DvdPlayer getInstance() {
		return dvdPlayer;
	}

	public void on() {
		System.out.println("��DVD������");
	}

	public void off() {
		System.out.println("�ر�DVD������");
	}

	public void play(String filmName) {
		System.out.println("��ʼ���ŵ�Ӱ����" + filmName + "��");
	}

	public void pause(String filmName) {
		System.out.println("ֹͣ���ŵ�Ӱ����" + filmName + "��");
	}
}
