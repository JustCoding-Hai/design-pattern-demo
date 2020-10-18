package com.learn.singleton;

/*
 * ����ģʽ�İ���д��2��������ʽ����̬����飩
 */
public class SingletonTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton02 singleton1 = Singleton02.getInstance();
		Singleton02 singleton2 = Singleton02.getInstance();
		System.out.println(singleton1 == singleton2);
		System.out.println("singleton1.hascode:" + singleton1.hashCode());
		System.out.println("singleton2.hascode:" + singleton2.hashCode());
	}

}

class Singleton02 {
	// 1.���췽��˽�л�����ֹ����ⲿʹ��new��������Ķ���
	private Singleton02() {

	}

	// 2.���ڲ��������󣬸�ʵ��������Ϊ��̬����
	private static Singleton02 instance;

	static {
		instance = new Singleton02();
	}

	// 3.�ṩ���еľ�̬����������ʵ������
	public static Singleton02 getInstance() {
		return instance;
	}

}
