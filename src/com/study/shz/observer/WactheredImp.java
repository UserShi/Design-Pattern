package com.study.shz.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者的实现
 * @author shihaozhan
 *
 */
public class WactheredImp implements Wacthered{

	//存储观察者  
	private List<Wacther> list;
	
	private String message;
	public WactheredImp() {
		list = new ArrayList<Wacther>();
	}

	@Override
	public void registerObserver(Wacther w) {
	
		list.add(w);
	}

	@Override
	public void removeObserver(Wacther w) {
		if(!list.isEmpty()){
			list.remove(w);
		}
		
	}

	@Override
	public void notifyObserver() {
		if(list!=null&&list.size()>0){
			for (Wacther wacther : list) {
				wacther.update(message);
			}
		}
	}
	public  void setMessage(String s){
		this.message=s;
		//更新消息通知观察者
		notifyObserver();
	}
}
