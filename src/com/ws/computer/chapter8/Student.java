package com.ws.computer.chapter8;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月12日下午1:48:30
 */
public class Student {
	
	private String name;

	private int age;
	
	private int number;

	public Student(String name, int age,int number) {
		super();
		this.name = name;
		this.age = age;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
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

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", number=" + number + "]";
	}

	

}
