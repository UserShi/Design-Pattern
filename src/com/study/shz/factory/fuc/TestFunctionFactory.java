package com.study.shz.factory.fuc;

public class TestFunctionFactory {

	public static void main(String[] args) {
				//工厂方法模式
				//各个产品的生产商，都拥有各自的工厂
				//生产工艺，生成的高科技程度都是不一样的
		ComputerFactory factory = new AsusFactory();
		//需要用户关心，这个产品的生产商
		factory.getComputer().makeComputer();
		//增加的代码的使用复杂度
		//抽象工厂模式
	}

}
