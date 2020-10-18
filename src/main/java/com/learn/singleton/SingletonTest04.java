package com.learn.singleton;

/*
 * ����ģʽ�İ���д��4�����̰߳�ȫ������ʽ
 */
public class SingletonTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton04 singleton1 = Singleton04.getInstance();
		Singleton04 singleton2 = Singleton04.getInstance();
		System.out.println(singleton1 == singleton2);
		System.out.println("singleton1.hascode:" + singleton1.hashCode());
		System.out.println("singleton2.hascode:" + singleton2.hashCode());
	}

}

class Singleton04 {
	// 1.���췽��˽�л�����ֹ����ⲿʹ��new��������Ķ���
	private Singleton04() {

	}

	// 2.��������
	private static Singleton04 instance;

	// 3.�ṩ���еľ�̬������������Ϊnull��ʵ�������󣨼���synchronized�ؼ��֣�
	public static synchronized Singleton04 getInstance() {
		if (instance == null) {
			instance = new Singleton04();
		}
		return instance;

	}

}
