package com.learn.singleton;

/*
 * ����ģʽ�İ���д��6�����̰߳�ȫ������ʽ��˫�ؼ�飩
 */
public class SingletonTest07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton07 singleton1 = Singleton07.getInstance();
		Singleton07 singleton2 = Singleton07.getInstance();
		System.out.println(singleton1 == singleton2);
		System.out.println("singleton1.hascode:" + singleton1.hashCode());
		System.out.println("singleton2.hascode:" + singleton2.hashCode());
	}

}

class Singleton07 {
	// 1.���췽��˽�л�����ֹ����ⲿʹ��new��������Ķ���
	private Singleton07() {

	}

	// 2.дһ����̬�ڲ��࣬������һ����̬����Singleton
	private static class SingletonInstance {
		private static final Singleton07 instance = new Singleton07();
	}

	// 3.�ṩ���еľ�̬������ȡ�ڲ����е�����
	public static Singleton07 getInstance() {
		return SingletonInstance.instance;

	}

}
