package com.learn.singleton;

/*
 * ����ģʽ�İ���д��3�����̲߳���ȫ������ʽ
 */
public class SingletonTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton03 singleton1 = Singleton03.getInstance();
		Singleton03 singleton2 = Singleton03.getInstance();
		System.out.println(singleton1 == singleton2);
		System.out.println("singleton1.hascode:" + singleton1.hashCode());
		System.out.println("singleton2.hascode:" + singleton2.hashCode());
	}

}

class Singleton03 {
	// ����һ����̬��������¼Singleton��Ψһʵ��
	private static Singleton03 instance;

	// ���췽��˽�л�����ֹ����ⲿʹ��new��������Ķ���
	private Singleton03() {
	}

	// �ṩ���еľ�̬������������Ϊnull��ʵ�������󣬲����ظ�ʵ��
	public static Singleton03 getInstance() {
		// ���instance�����ڣ���ʹ��˽�õĹ���������
		if (instance == null) {
			instance = new Singleton03();
		}
		return instance;
	}
//�����ķ���
}
