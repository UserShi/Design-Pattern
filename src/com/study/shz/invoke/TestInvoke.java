package com.study.shz.invoke;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;

import com.sun.xml.internal.ws.util.StringUtils;



public class TestInvoke {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException  {
		CountDownLatch latch = new  CountDownLatch(10);
		for (int i = 0; i < 10; i++) {
			new Thread(){

				@Override
				public void run() {
					String str = UUID.randomUUID().toString();
					try {
						this.sleep(111);
						System.err.println(str);
						testInvokemethod(str);
					} catch (InstantiationException | IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}.start();
			
			latch.countDown();
		}
		try {
			latch.await();//等待所有线程全部完成，最终输出结果
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//testInvokemethod("111");
	}
			
	public static  void  testInvokemethod(String  args) throws InstantiationException, IllegalAccessException{
		Class actionClass;
		try {
			actionClass = Class.forName("com.gupaodeu.shz.invoke.SHZInvoke");
			Object action=actionClass.newInstance();
			Method method;
			method = actionClass.getMethod("testMethod", String.class);
			method.invoke(action,args);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
