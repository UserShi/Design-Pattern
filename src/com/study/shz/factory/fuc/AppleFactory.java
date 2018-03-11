package com.study.shz.factory.fuc;

import com.study.shz.factory.Apple;
import com.study.shz.factory.Computer;

public class AppleFactory implements ComputerFactory{

	@Override
	public Computer getComputer() {
		System.err.println("AppleFactory");
		return new Apple();
	}

}
