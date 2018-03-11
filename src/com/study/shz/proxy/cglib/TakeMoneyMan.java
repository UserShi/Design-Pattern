package com.study.shz.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class TakeMoneyMan implements MethodInterceptor{
	
	//疑问？
	//好像并没有持有被代理对象的引用
	public Object  getInstance(Class clazz){
		Enhancer enhancer = new Enhancer();
		//把父类设置为谁？
		//这一步就是告诉cglib，生成的子类需要继承哪个类
		enhancer.setSuperclass(clazz);
		//设置回调
		enhancer.setCallback(this);
		System.err.println("创建子类，进行代理取钱");
		//第一步、生成源代码
		//第二步、编译成class文件
		//第三步、加载到JVM中，并返回被代理对象
		return enhancer.create();
	}
	
	
	
	@Override
	public Object intercept(Object object, Method method, Object[] objs, MethodProxy proxy) throws Throwable {
		System.err.println("开始代理取钱=====");
		proxy.invokeSuper(object, objs);
		System.err.println("结束代理取钱=====");
		return null;
	}

}
