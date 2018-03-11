package com.study.shz.factory.abstr;

import com.study.shz.factory.Apple;
import com.study.shz.factory.Computer;

public class AppleFactory extends AbstractFactory{

	@Override
	public Computer getComputer() {
		System.err.println("AppleFactory");
		return new Apple();
	}

}
