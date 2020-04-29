package com.ws.computer.dayi.chapter4;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年4月29日下午4:17:30
 */
public class Person {
	
	
	//1.static 可以修饰成员变量：  静态成员变量
	//2.static 可以修饰方法： 静态方法
	
	
	private String name2;
	
	
	public static String name = "张三" ;
	
	
	public static void method(){
		//methodA();
		System.out.println("我是static静态方法...");
	}
	
	public void methodA(){
		method();
		System.out.println("我是非静态方法...");
	}

}
