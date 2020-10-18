package com.learn.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ProxyFactory implements MethodInterceptor {

	private Object target;// 目标对象

	// 构造器，接受一个目标对象
	public ProxyFactory(Object target) {
		this.target = target;
	}

	// 返回一个代理对象
	public Object getProxyInstance() {
		// 1 创建一个工具类
		Enhancer enhancer = new Enhancer();
		// 2.设置父类
		enhancer.setSuperclass(target.getClass());
		// 3.设置回调函数
		enhancer.setCallback(this);
		// 4 创建子类对象，即代理对象
		return enhancer.create();
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("cglib代理开始");
		Object returnVal = method.invoke(target, args);
		System.out.println("cglib代理提交");
		return returnVal;
	}

}
