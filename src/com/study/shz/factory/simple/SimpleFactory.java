package com.study.shz.factory.simple;

import com.study.shz.factory.Apple;
import com.study.shz.factory.Asus;
import com.study.shz.factory.Computer;
import com.study.shz.factory.Hpbook;

//对于这个工厂来说(太强大了)
//为什么？
//这个工厂啥都能干(不符合现实)
//编码也是一种艺术(融汇贯通),艺术来源于生活，回归到生活的
public class SimpleFactory {
	//实现统一管理、专业化管理
		//如果没有工厂模式，小作坊，没有执行标准的
		//如果买到三无产品（没有标准）
		//卫生监督局工作难度会大大减轻
		
		//中国制造(按人家的标准执行)
		//中国制造向中国创造改变(技术不是问题了，问题是什么？思维能力)
		//码农就是执行标准的人
		//系统架构师，就是制定标准的人
		
		//不只做一个技术者，更要做一个思考者
	public Computer getComputer (String name){
		if("ASUS".equalsIgnoreCase(name)){
			return  new  Asus();
		}else if("APPLE".equalsIgnoreCase(name)){
			return new Apple();
		}else if("HPbook".equalsIgnoreCase(name)){
			return  new Hpbook();
		}else{
			return  null;
		}
		
	}
}
