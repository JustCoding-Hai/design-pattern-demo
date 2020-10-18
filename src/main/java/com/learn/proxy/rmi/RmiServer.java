package com.learn.proxy.rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RmiServer {

	public static void main(String[] args) throws Exception {
		int port = 1099;
		String url = "rmi://localhost:1099/com.learn.proxy.rmi.HelloServiceImpl";
		String url2 = "rmi://localhost:1099/com.learn.proxy.rmi.HelloServiceImpl2";
		LocateRegistry.createRegistry(port);
		Naming.rebind(url, new HelloServiceImpl());
		Naming.rebind(url2, new HelloServiceImpl2());
	}
}
