
package com.study.shz.factory.fuc;

import com.study.shz.factory.Asus;
import com.study.shz.factory.Computer;

public class AsusFactory implements ComputerFactory{

	@Override
	public Computer getComputer() {
		System.err.println("AsusFactory");
		return  new Asus();
	}
	
}
