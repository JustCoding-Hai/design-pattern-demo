package com.learn.singleton;

/*
 * ����ģʽ�İ���д��6�����̰߳�ȫ������ʽ��˫�ؼ�飩
 */
public class SingletonTest08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton08 singleton1 = Singleton08.INSTANCE;
		Singleton08 singleton2 = Singleton08.INSTANCE;
		System.out.println(singleton1 == singleton2);
		System.out.println("singleton1.hascode:" + singleton1.hashCode());
		System.out.println("singleton2.hascode:" + singleton2.hashCode());

	}

}

enum Singleton08 {
	INSTANCE;

}
