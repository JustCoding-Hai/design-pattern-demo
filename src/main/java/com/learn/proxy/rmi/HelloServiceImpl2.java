package com.learn.proxy.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServiceImpl2 extends UnicastRemoteObject implements HelloService {

	protected HelloServiceImpl2() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sayHello(String name) throws RemoteException {
		// TODO Auto-generated method stub
		return "¹ö";
	}

}
