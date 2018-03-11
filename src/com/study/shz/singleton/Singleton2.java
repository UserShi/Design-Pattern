package com.study.shz.singleton;

/**
 * 懒汉式单利  不安全
 * @author shihaozhan
 *
 */
public class Singleton2 {

	//1、第一步先将构造方法私有化
	private Singleton2(){
		
	}
	//2、然后声明一个静态变量保存单例的引用
	private static  Singleton2  Instance=null;
	//3、通过提供一个静态方法来获得单例的引用
		//不安全的
	public static Singleton2 getInstance (){
		if(Instance==null){
			Instance = new Singleton2();
		}
		return Instance;
	}
}
