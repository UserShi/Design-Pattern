package com.study.shz.strategy;

import java.util.ArrayList;
import java.util.List;

public class XiangqinUtils {
	
	/**
	 * 相亲筛选  是否复合相亲人的条件
	 * @param list
	 * @param love
	 */
	public static List ComparePerson(Person standard,List list,FallinLove love){
		List resultlist  = new  ArrayList<Person>();
		for (Object object : list) {
			if(object instanceof Person){
				Person p = (Person)object;
				if(love.ComparePerson(p, standard)>0){
					resultlist.add(p);
				}
			}
		}
		
		return  resultlist;
	}
	
}
