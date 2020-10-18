package com.learn.proxy.cglib;

public class Client {
	public static void main(String[] args) {
		TeacherService teacherService = new TeacherService();
		ProxyFactory proxyFactory = new ProxyFactory(teacherService);
		TeacherService proxyObj = (TeacherService) proxyFactory.getProxyInstance();
		proxyObj.hello();
	}
}
