package com.ws.computer.chapter5.fiveandsix;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年4月29日上午8:52:23
 */
public class Person {
	
	
	private String name;
	private int age;
	
	public static String info = "人";
	
	
	public static void method(){
		
		
		
	}
	
	public void methodA(){
		method();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println(this);
		this.name = name;//p.name
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
