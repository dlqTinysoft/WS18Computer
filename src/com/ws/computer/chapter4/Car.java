package com.ws.computer.chapter4;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年4月26日上午8:36:51
 */
public class Car {
	
	private String brand;
	
	private String color;
	
	
	static{
		
		System.out.println("我是静态代码快");
		
	}
	
	//定义静态变量
	public static String name;
	
	//定义静态方法
	public static void method(){
		
	   System.out.println("我是静态方法......");
	}
	
	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}
