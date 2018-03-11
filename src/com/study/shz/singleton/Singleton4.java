package com.study.shz.singleton;
/**
 * 懒汉式单例   线程安全   双重校验锁
 * @author shihaozhan
 *这个版本的代码看起来有点复杂，注意其中有两次if (instance == null)的判断，这个叫做『双重检查 Double-Check』。
  ● 第一个if (instance == null)，其实是为了解决Version2中的效率问题，只有instance为null的时候，才进入synchronized的代码段——大大减少了几率。
  ● 第二个if (instance == null)，则是跟Version2一样，是为了防止可能出现多个实例的情况。
—— 这段代码看起来已经完美无瑕了。

—— 当然，只是『看起来』，还是有小概率出现问题的。
这弄清楚为什么这里可能出现问题，首先，我们需要弄清楚几个概念：原子操作、指令重排。
 */
public class Singleton4 {
	private Singleton4(){
		
	}
	//private  static Singleton4 single =null;
	/**
	 * volatile关键字的一个作用是禁止指令重排，把instance声明为volatile之后，对它的写操作就会有一个内存屏障（什么是内存屏障？），这样，在它的赋值完成之前，就不用会调用读操作。
		注意：volatile阻止的不singleton = new Singleton()这句话内部[1-2-3]的指令重排，而是保证了在一个写操作（[1-2-3]）完成之前，不会调用读操作（if (instance == null)）。
	 */	
	private  static volatile Singleton4 single =null;
	public static  Singleton4 getInstance(){
		if(single==null){
			synchronized (Singleton4.class) {
				if(single==null){
					single = new Singleton4();
				}
			}
		}
		return single;
	}
}
