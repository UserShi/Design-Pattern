package com.study.shz.strategy;

/**
 * 策略模式
 * @author shihaozhan
 *
 */
public interface FallinLove {
	/**
	 * 判断是否达到要求   1 超出要求 0标准要求  -1 不符合要求
	 * @return
	 */
	public  int ComparePerson(Person p1,Person  standard);
}
