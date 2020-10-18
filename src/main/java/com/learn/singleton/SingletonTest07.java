package com.learn.singleton;

/*
 * 单例模式的八种写法6——线程安全的懒汉式（双重检查）
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
	// 1.构造方法私有化，防止类的外部使用new创建该类的对象
	private Singleton07() {

	}

	// 2.写一个静态内部类，其中有一个静态属性Singleton
	private static class SingletonInstance {
		private static final Singleton07 instance = new Singleton07();
	}

	// 3.提供公有的静态方法获取内部类中的属性
	public static Singleton07 getInstance() {
		return SingletonInstance.instance;

	}

}
