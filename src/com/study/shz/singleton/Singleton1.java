package com.study.shz.singleton;
/**
 * 饿汉式单利 
 * @author shihaozhan
 *
 */
public class Singleton1 {
	/**
	 * 饿汉式单利
	 */
	private static final  Singleton1 Instance = new Singleton1();
	private Singleton1(){
		
	}
	public static Singleton1 getInstance (){
		return Instance;
	}
}
