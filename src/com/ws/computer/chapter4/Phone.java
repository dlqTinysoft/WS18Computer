package com.ws.computer.chapter4;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年4月26日下午3:01:07
 */
public class Phone {
	
	private String brand;
	private float price;
	
	//static 关键字的使用
	public static String info;
	
	//静态方法
	public static void method(){
		System.out.println("我是静态方法....");
	}
	
	//静态代码
	static{
		System.out.println("我是静态代码快....");
		method();
	}
	
	
	public void methodA(){
		method();
	}
	
	
	
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
	
	
	
	

}
