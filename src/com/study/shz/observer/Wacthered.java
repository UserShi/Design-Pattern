package com.study.shz.observer;

/**
 * 抽象被观察者
 * @author shihaozhan
 *	
 */
public interface Wacthered {
	//添加
	public void registerObserver(Wacther w);
	//删除
	public void removeObserver(Wacther w);
	//通知观察者
	public void notifyObserver();
}
