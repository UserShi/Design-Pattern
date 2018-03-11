package com.study.shz.factory;

public class Hpbook implements Computer{

	@Override
	public String makeComputer() {
		System.err.println("Hpbook");
		return  "Hpbook";
		
	}

}
