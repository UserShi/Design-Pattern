package com.study.shz.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DaiLiMan implements InvocationHandler{
	//被代理对象的引用作为一个成员变量保存下来了
	private  Person  haozhan;
	
	//获取被代理人的个人资料
	public   Object getInstance(Person  xiaoshi){
		this.haozhan =xiaoshi;
		Class clazz = xiaoshi.getClass();
		System.err.println("获取代理对象");
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.err.println("代理取钱开始---------");
		// 调用		
		method.invoke(this.haozhan, args);
		System.err.println("代理取钱结束");
		return null;
	}

}
