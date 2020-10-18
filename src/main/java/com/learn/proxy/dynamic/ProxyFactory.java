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
						System.out.println("正在代理对象：" + target.getClass().getSimpleName());
						System.out.println("JDK代理开始，代理方法：" + method.getName());
						if (args != null) {
							for (Object arg : args) {
								System.out.println("传递的方法参数为:" + arg.toString());
							}
						}
						// 利用反射机制调用目标对象的方法
						Object invoke = method.invoke(target, args);// args为方法执行传递的实参
						System.out.println("JDK代理结束");
						return invoke;// 方法返回值
					}
				});

	}
}
