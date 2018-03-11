
package com.study.shz.factory.abstr;

import com.study.shz.factory.Asus;
import com.study.shz.factory.Computer;

public class AsusFactory  extends AbstractFactory{

	@Override
	public Computer getComputer() {
		System.err.println("AsusFactory");
		return  new Asus();
	}
	
}
