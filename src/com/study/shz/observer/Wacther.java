package com.study.shz.observer;

/**
 * 
 * @author shihaozhan
 *		抽象观察者
 */
public interface Wacther {
	//当被观察者调用 改变方法 notifyObserver方法时候，这个方法会被回调
	public void update(String  messsage);
	  	
}
