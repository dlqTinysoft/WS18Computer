package com.ws.computer.chapter8.oneandtwo;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月12日下午3:17:02
 */
public class Student {
	
	private int age ;
	private int number;
	private String name;
	public Student(int age, int number, String name) {
		super();
		this.age = age;
		this.number = number;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", number=" + number + ", name=" + name + "]";
	}
	

}
