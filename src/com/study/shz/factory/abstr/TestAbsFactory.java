package com.study.shz.factory.abstr;

import com.study.shz.factory.Computer;

public class TestAbsFactory {
	//设计模式的经典之处，就在于，解决了编写代码的人和调用代码的人双方的痛处
			//解放我们的双手
	public static void main(String[] args) {
		PublicFactory factory = new PublicFactory();
		PublicFactory.Test test = factory.new Test();
		factory.getComputer("ASUS").makeComputer();
		
		
	}

}
