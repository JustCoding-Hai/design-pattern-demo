package com.learn.singleton;

/*
 * ����ģʽ�İ���д��1��������ʽ����̬������
 */
public class SingletonTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton1 == singleton2);
		System.out.println("singleton1.hascode:" + singleton1.hashCode());
		System.out.println("singleton2.hascode:" + singleton2.hashCode());
	}

}

class Singleton {
	// 1.���췽��˽�л�����ֹ����ⲿʹ��new��������Ķ���
	private Singleton() {

	}

	// 2.���ڲ��������󣬸�ʵ��������Ϊ��̬����
	private final static Singleton INSTANCE = new Singleton();
	// private final static Singleton INSTANCE2 = new Singleton();

	// 3.�ṩ���еľ�̬����������ʵ������
	public static Singleton getInstance() {
		return INSTANCE;
	}

//	public static Singleton getInstance2() {
//		return INSTANCE2;
//	}
}
