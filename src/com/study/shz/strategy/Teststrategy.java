package com.study.shz.strategy;

import java.util.ArrayList;
import java.util.List;

public class Teststrategy {
	
	
	public static void main(String[] args) {
		/**
		 * 相亲对象的标准
		 */
		Person p1 = new Person();
		p1.setHeight(180);
		p1.setMoney(500);
		
		/**
		 * 来相亲的人
		 */
		Person p2 = new Person();
		p2.setHeight(170);
		p2.setMoney(600);
		Person p3 = new Person();
		p3.setHeight(185);
		p3.setMoney(800);
		List list  = new  ArrayList<Person>();
		//list.add(p1);
		list.add(p2);
		list.add(p3);
		List resultlist = XiangqinUtils.ComparePerson(p1,list, new FallinLove() {
			
			@Override
			public int ComparePerson(Person p1,Person p2 ) {
				if(p1.getHeight()>p2.getHeight()){
					if(p1.getMoney()>=p2.getMoney()){
						return 1;
					}else {
						return -1;
					}
				}else{					
					return -1;					
				}
			}
		});
		System.err.println(resultlist.size());
	}
}
