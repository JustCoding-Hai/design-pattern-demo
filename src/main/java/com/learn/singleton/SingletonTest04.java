package com.learn.singleton;

/*
 * 单例模式的八种写法4——线程安全的懒汉式
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
	// 1.构造方法私有化，防止类的外部使用new创建该类的对象
	private Singleton04() {

	}

	// 2.声明对象
	private static Singleton04 instance;

	// 3.提供公有的静态方法，当对象为null才实例化对象（加入synchronized关键字）
	public static synchronized Singleton04 getInstance() {
		if (instance == null) {
			instance = new Singleton04();
		}
		return instance;

	}

}
