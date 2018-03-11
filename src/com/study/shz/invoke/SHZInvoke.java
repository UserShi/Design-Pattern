package com.study.shz.invoke;

public class SHZInvoke {

		
	public static String clientid;
	public  void  testMethod(String  args){
		System.err.println(clientid);
		if(clientid!=null&&!"".equals(clientid)){
			System.err.println("1111");
		}else{
			clientid=args;
		}
		
		System.err.println(clientid);
	}
	
}
