package com.learn.proxy.rmi;

import java.rmi.Naming;

public class RmiClient {

	public static void main(String[] args) throws Exception {
		String url = "rmi://localhost:1099/com.learn.proxy.rmi.HelloServiceImpl";
		HelloService helloService = (HelloService) Naming.lookup(url);
		String result = helloService.sayHello("Jack");
		System.out.println(result);
		String url2 = "rmi://localhost:1099/com.learn.proxy.rmi.HelloServiceImpl2";
		HelloService helloService2 = (HelloService) Naming.lookup(url2);
		String result2 = helloService2.sayHello("Jack");
		System.out.println(result2);
	}
}
