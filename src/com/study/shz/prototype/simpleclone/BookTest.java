package com.study.shz.prototype.simpleclone;

import java.util.ArrayList;
import java.util.List;

public class BookTest {
			//就是一个现成的对象，这个对象里面有已经设置好的值
			//当我要新建一个对象，并且要给新建的对象赋值，而且赋值内容要跟之前的一模一样
			//用循环，用反射，确实可以的（反射性能并不高）
			//字节码复制newInstance()

			//ORM的时候经常用到的
			
			
			//能够直接拷贝其实际内容的数据类型/只支持9种,八大基本数据类型+String 浅拷贝
			//深拷贝
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
		book.setName("shz");
		book.setContent("好好学习天天向上");
		book.setPage(10);
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		book.setList(list);
		try {
			Book bookclone = (Book) book.clone();
			System.err.println(book.getContent()==bookclone.getContent());
			System.err.println(book==bookclone);
			System.err.println(book.getList()==bookclone.getList());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
