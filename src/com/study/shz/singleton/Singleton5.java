package com.study.shz.singleton;
/**
 * 静态内部类 单利
 * @author shihaozhan
 *  懒汉式（静态内部类）
	这种写法，即解决安全问题，又解决了性能问题
	这个代码，没有浪费一个字
	
	这种写法非常巧妙：
  	● 对于内部类SingletonHolder，它是一个饿汉式的单例实现，在SingletonHolder初始化的时候会由ClassLoader来保证同步，使INSTANCE是一个真·单例。
  	● 同时，由于SingletonHolder是一个内部类，只在外部类的Singleton的getInstance()中被使用，所以它被加载的时机也就是在getInstance()方法第一次被调用的时候。
	——它利用了ClassLoader来保证了同步，同时又能让开发者控制类加载的时机。从内部看是一个饿汉式的单例，但是从外部看来，又的确是懒汉式的实现。
	简直是神乎其技
 */
//我们所写的所有的代码，在java的反射机制面前，都是裸奔的
//反射机制是可以拿到private修饰的内容的
//我们可以理解成即使加上private也不靠谱（按正常套路出牌，貌似可以）


//类装载到JVM中过程
//1、从上往下(必须声明在前，使用在后)
//先属性、后方法
//先静态、后动态
public class Singleton5 {
	//1、先声明一个静态内部类
		//private 私有的保证别人不能修改
		//static 保证全局唯一
	private  static class SingletonHolder{
		private  static final Singleton5 single = new Singleton5();
	}
	
	//2、将默认构造方法私有化
	private  Singleton5(){
		
	}
		//相当于有一个默认的public的无参的构造方法，就意味着在代码中随时都可以new出来	
		//3、同样提供静态方法获取实例
		//final 确保别人不能覆盖
	public static final Singleton5 getInstance(){
		return  SingletonHolder.single;
	}
//	static int a = 1;
//	//不管该class有没有实例化，static静态块总会在classLoader执行完以后，就加载完毕
//	static{
//		//静态块中的内容，只能访问静态属性和静态方法
//		//只要是静态方法或者属性，直接可以用Class的名字就能点出来
//		Singleton4.a = 2;
//		//JVM 内存中的静态区，这一块的内容是公共的 
//	}
	
}
