package com.study.shz.factory.abstr;

import com.study.shz.factory.Computer;


public abstract class AbstractFactory {
	protected abstract Computer getComputer();
	
	//这段代码就是动态配置的功能
	//固定模式的委派
	public Computer getComputer (String name){
		if("ASUS".equalsIgnoreCase(name)){
			return  new  AsusFactory().getComputer();
		}else if("APPLE".equalsIgnoreCase(name)){
			return new AppleFactory().getComputer();
		}else if("HPbook".equalsIgnoreCase(name)){
			return  new HpFactory().getComputer();
		}else{
			return  null;
		}
		
	}
	
}
