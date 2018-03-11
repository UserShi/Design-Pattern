package com.study.shz.delegate;

public class EmployeeB implements DoJob{

	@Override
	public void doJob() {
		System.err.println("EmployeeB:dojob");
	}

}
