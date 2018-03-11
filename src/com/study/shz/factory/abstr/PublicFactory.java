package com.study.shz.factory.abstr;

import com.study.shz.factory.Computer;

public  class PublicFactory extends AbstractFactory{

	@Override
	protected Computer getComputer() {
		
		return null;
	}
	public  class Test{
		public String str="111"; 
	}
}
