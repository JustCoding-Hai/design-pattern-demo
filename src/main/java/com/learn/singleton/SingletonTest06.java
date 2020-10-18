package com.learn.singleton;

/*
 * 单例模式的八种写法6——线程安全的懒汉式（双重检查）
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
	// 1.构造方法私有化，防止类的外部使用new创建该类的对象
	private Singleton06() {
	}

	// 2.声明对象
	private static volatile Singleton06 instance;

	// 3.提供公有的静态方法，当对象为null才实例化该类（加入synchronized关键字）
	public static Singleton06 getInstance() {
		if (instance == null) {// 如果对象为null，才进入同步区块
			synchronized (Singleton06.class) {
				if (instance == null) {// 再检查一次，对象仍为null才初始化为实例。
					instance = new Singleton06();
				}
			}
		}
		return instance;

	}

}
