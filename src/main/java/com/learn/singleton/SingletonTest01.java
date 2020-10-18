package com.learn.singleton;

/*
 * 单例模式的八种写法1——饿汉式（静态常量）
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
	// 1.构造方法私有化，防止类的外部使用new创建该类的对象
	private Singleton() {

	}

	// 2.类内部创建对象，该实例对象作为静态常量
	private final static Singleton INSTANCE = new Singleton();
	// private final static Singleton INSTANCE2 = new Singleton();

	// 3.提供公有的静态方法，返回实例对象
	public static Singleton getInstance() {
		return INSTANCE;
	}

//	public static Singleton getInstance2() {
//		return INSTANCE2;
//	}
}
