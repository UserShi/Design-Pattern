package com.study.shz.factory;

public class Apple implements Computer{

	@Override
	public String makeComputer() {
		System.err.println("apple");
		return "Apple";
	}

}
