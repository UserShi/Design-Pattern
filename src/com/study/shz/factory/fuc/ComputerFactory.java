package com.study.shz.factory.fuc;

import com.study.shz.factory.Computer;

//工厂接口，就定义了所有工厂的执行标准
public interface ComputerFactory {
	
	
	Computer getComputer();
	
}
