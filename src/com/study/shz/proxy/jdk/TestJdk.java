package com.study.shz.proxy.jdk;

public class TestJdk {

	public static void main(String[] args) {
		//原理：
		//1.拿到被代理对象的引用，然后获取它的接口
		//2.JDK代理重新生成一个类，同时实现我们给的代理对象所实现的接口
		//3.把被代理对象的引用也拿到了
		//4.重新动态生成一个class字节码
		//5.然后编译
		
		//获取字节码内容
//		byte[] data = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
//		FileOutputStream os = new FileOutputStream("E:/GP_WORKSPACE/$Proxy0.class");
//		os.write(data);
//		os.close();
		
		//是什么?
		//为什么？
		//怎么做？
		Person  person  =  (Person) new DaiLiMan().getInstance(new ShiHaoZhan());
		person.takeMoney();
	}

}
