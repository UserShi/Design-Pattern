package com.study.shz.factory.fuc;

import com.study.shz.factory.Computer;
import com.study.shz.factory.Hpbook;

public class HpFactory implements ComputerFactory{

	@Override
	public Computer getComputer() {
		System.err.println("HpFactory");
		return  new Hpbook();
	}

}
