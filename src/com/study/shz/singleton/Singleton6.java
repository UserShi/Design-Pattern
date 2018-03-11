package com.study.shz.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 类似Spring里面的方法，将类名注册，下次从里面直接获取。  
 * @author shihaozhan
 *
 */
public class Singleton6 {
	protected  Singleton6(){
		
	}
	
	private static  Map<String,Singleton6>  map =   new  HashMap<String,Singleton6>();
	static{
		Singleton6 single = new Singleton6();
		map.put(single.getClass().getName(),single);
	}
	public static Singleton6 getInstance(String name){
		if(name==null){
			name = Singleton6.class.getName();
		}
		if(map.get(name)==null){
			try {
				map.put(name, (Singleton6) Class.forName(name).newInstance());
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return map.get(name);
	}
}
