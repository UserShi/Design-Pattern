package com.study.shz.prototype.simpleclone;

import java.util.ArrayList;
import java.util.List;

public class Book implements Cloneable{
	
	private String name;
	private String content;
	private  int  page;
	private  ArrayList<String>  list;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	
	public ArrayList<String> getList() {
		return list;
	}
	public void setList(ArrayList<String> list) {
		this.list = list;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Book bookclone =  null;
		bookclone = (Book) super.clone();
		bookclone.setList((ArrayList<String>) this.list.clone());
		return bookclone;
	}
	
}
