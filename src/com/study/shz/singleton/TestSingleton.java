package com.study.shz.singleton;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;

public class TestSingleton {

	public static void main(String[] args) {
		int count  =100;
		//测试发令枪    测试并发用
		CountDownLatch  latch = new CountDownLatch(count);
		//Set默认去去重的，set是本身线程不安全的
		//饿汉式  
		//final Set<Singleton1> set = Collections.synchronizedSet( new  HashSet<Singleton1>());
		//懒汉式 不安全
		//final Set<Singleton2> set = Collections.synchronizedSet( new  HashSet<Singleton2>());
		//懒汉式 线程安全  但是性能不佳
		//final Set<Singleton3> set = Collections.synchronizedSet( new  HashSet<Singleton3>());
		//懒汉式  双重校验锁
		final Set<Singleton4> set = Collections.synchronizedSet( new  HashSet<Singleton4>());
		for (int i = 0; i < count; i++) {
			new Thread(){

				@Override
				public void run() {
					//System.err.println(UUID.randomUUID().toString());
					set.add(Singleton4.getInstance());
				}
				
			}.start();
			latch.countDown();
		}
		try {
			latch.await();
			System.err.println(set.size());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
