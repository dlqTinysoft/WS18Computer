package com.ws.chapter2;

/**
 * 作者：董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年4月12日下午10:36:20
 */
public class Student {
	private String name;
	private String number;
	private int age;
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	public void info(){
		System.out.println("姓名:"+name+"   年龄:"+age+"  学号:"+number);
	}
	

}
