package com.study.shz.strategy;

/**
 * 
 * @author shihaozhan
 *
 */
public class Person {
	private  int height ;
	
	private  int  money;
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Person(int height, int money) {
		super();
		this.height = height;
		this.money = money;
	}

	public Person() {
	
	}
	
	
	
}
