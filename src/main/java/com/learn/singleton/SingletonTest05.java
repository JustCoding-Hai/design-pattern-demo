package com.learn.singleton;

/*
 * 单例模式的八种写法5——线程不安全的懒汉式（同步代码块）
 */
public class SingletonTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton05 singleton1 = Singleton05.getInstance();
		Singleton05 singleton2 = Singleton05.getInstance();
		System.out.println(singleton1 == singleton2);
		System.out.println("singleton1.hascode:" + singleton1.hashCode());
		System.out.println("singleton2.hascode:" + singleton2.hashCode());
	}

}

class Singleton05 {
	// 1.构造方法私有化，防止类的外部使用new创建该类的对象
	private Singleton05() {

	}

	// 2.声明对象
	private static Singleton05 instance;

	// 3.提供公有的静态方法，当对象为null才实例化对象（加入synchronized关键字）
	public static Singleton05 getInstance() {
		if (instance == null) {
			synchronized (Singleton05.class) {
				instance = new Singleton05();
			}
		}
		return instance;

	}

}
