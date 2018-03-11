package com.study.shz.factory.abstr;

import com.study.shz.factory.Computer;
import com.study.shz.factory.Hpbook;

public class HpFactory extends AbstractFactory{

	@Override
	public Computer getComputer() {
		System.err.println("HpFactory");
		return  new Hpbook();
	}

}
