package com.study.shz.delegate;

public class DelegateTest {
	
	/**
	 * 委派模式
	 * @param args
	 */
	public static void main(String[] args) {
				//看上去好像是我们的老板在干活
				//但实际干活的人是普通员工
				//这就是典型，干活是我的，功劳是你的
		Boss boss = new Boss(new EmployeeA());
		boss.doJob();

	}

}
