package com.study.shz.factory;

public class Asus implements Computer{

	@Override
	public String makeComputer() {
		
		System.err.println("ASUS");
		
		return  "ASUS";
	}
	
}
