package com.learn.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

	private Object target;

	public ProxyFactory(Object target) {
		// TODO Auto-generated constructor stub
		this.target = target;
	}

	public Object getProxyInstance() {

		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
				new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("���ڴ������" + target.getClass().getSimpleName());
						System.out.println("JDK����ʼ����������" + method.getName());
						if (args != null) {
							for (Object arg : args) {
								System.out.println("���ݵķ�������Ϊ:" + arg.toString());
							}
						}
						// ���÷�����Ƶ���Ŀ�����ķ���
						Object invoke = method.invoke(target, args);// argsΪ����ִ�д��ݵ�ʵ��
						System.out.println("JDK�������");
						return invoke;// ��������ֵ
					}
				});

	}
}
