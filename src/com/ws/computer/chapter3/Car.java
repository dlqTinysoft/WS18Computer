package com.ws.computer.chapter3;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年4月24日上午11:30:56
 */
public class Car {
	
	private String brand;
	private float price;
	
	public void setBrand(String brand) {
		System.out.println(this);
		this.brand = brand;//this.barnd 等价于c.brand 
	}
	
	
	
	public String getBrand() {
		return brand;
	}
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	

}
