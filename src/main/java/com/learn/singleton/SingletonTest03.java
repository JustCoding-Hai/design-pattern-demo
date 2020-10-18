package com.learn.singleton;

/*
 * 单例模式的八种写法3——线程不安全的懒汉式
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
	// 声明一个静态变量来记录Singleton的唯一实例
	private static Singleton03 instance;

	// 构造方法私有化，防止类的外部使用new创建该类的对象
	private Singleton03() {
	}

	// 提供公有的静态方法，当对象为null才实例化对象，并返回该实例
	public static Singleton03 getInstance() {
		// 如果instance不存在，则使用私用的构造器创建
		if (instance == null) {
			instance = new Singleton03();
		}
		return instance;
	}
//其他的方法
}
