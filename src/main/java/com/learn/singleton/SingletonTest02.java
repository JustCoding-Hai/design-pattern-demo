package com.learn.singleton;

/*
 * 单例模式的八种写法2——饿汉式（静态代码块）
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
	// 1.构造方法私有化，防止类的外部使用new创建该类的对象
	private Singleton02() {

	}

	// 2.类内部创建对象，该实例对象作为静态常量
	private static Singleton02 instance;

	static {
		instance = new Singleton02();
	}

	// 3.提供公有的静态方法，返回实例对象
	public static Singleton02 getInstance() {
		return instance;
	}

}
