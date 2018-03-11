package com.study.shz.observer;

public class WactherImp implements Wacther{
	
	
	private String name;
	private String message;
	@Override
	public void update(String messsage) {
		this.message=messsage;
		System.err.println(messsage);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WactherImp(String name) {
		super();
		this.name = name;
	}
	
	
	
}
