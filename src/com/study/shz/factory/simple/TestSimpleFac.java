package com.study.shz.factory.simple;

import com.study.shz.factory.Computer;

public class TestSimpleFac {

	public static void main(String[] args) {
		Computer com = new SimpleFactory().getComputer("ASUS");
		System.err.println(com.makeComputer());
	}

}
