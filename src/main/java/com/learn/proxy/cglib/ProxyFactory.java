package com.learn.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ProxyFactory implements MethodInterceptor {

	private Object target;// Ŀ�����

	// ������������һ��Ŀ�����
	public ProxyFactory(Object target) {
		this.target = target;
	}

	// ����һ���������
	public Object getProxyInstance() {
		// 1 ����һ��������
		Enhancer enhancer = new Enhancer();
		// 2.���ø���
		enhancer.setSuperclass(target.getClass());
		// 3.���ûص�����
		enhancer.setCallback(this);
		// 4 ����������󣬼��������
		return enhancer.create();
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("cglib����ʼ");
		Object returnVal = method.invoke(target, args);
		System.out.println("cglib�����ύ");
		return returnVal;
	}

}
