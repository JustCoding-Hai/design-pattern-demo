package com.learn.proxy.dynamic;

public class Client {
	public static void main(String[] args) {
		ITeacher teacher = new Teacher();
		ProxyFactory proxyFactory = new ProxyFactory(teacher);
		ITeacher proxyInstance = (ITeacher) proxyFactory.getProxyInstance();
		proxyInstance.teach();
		proxyInstance.check("ะกร๗");
	}
}
