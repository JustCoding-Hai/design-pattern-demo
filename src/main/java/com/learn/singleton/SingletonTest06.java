package com.learn.singleton;

/*
 * ����ģʽ�İ���д��6�����̰߳�ȫ������ʽ��˫�ؼ�飩
 */
public class SingletonTest06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton06 singleton1 = Singleton06.getInstance();
		Singleton06 singleton2 = Singleton06.getInstance();
		System.out.println(singleton1 == singleton2);
		System.out.println("singleton1.hascode:" + singleton1.hashCode());
		System.out.println("singleton2.hascode:" + singleton2.hashCode());
	}

}

class Singleton06 {
	// 1.���췽��˽�л�����ֹ����ⲿʹ��new��������Ķ���
	private Singleton06() {
	}

	// 2.��������
	private static volatile Singleton06 instance;

	// 3.�ṩ���еľ�̬������������Ϊnull��ʵ�������ࣨ����synchronized�ؼ��֣�
	public static Singleton06 getInstance() {
		if (instance == null) {// �������Ϊnull���Ž���ͬ������
			synchronized (Singleton06.class) {
				if (instance == null) {// �ټ��һ�Σ�������Ϊnull�ų�ʼ��Ϊʵ����
					instance = new Singleton06();
				}
			}
		}
		return instance;

	}

}
