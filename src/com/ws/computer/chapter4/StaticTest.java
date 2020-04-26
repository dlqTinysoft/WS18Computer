package com.ws.computer.chapter4;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年4月26日上午8:20:02
 * static关键字的使用
 * 
 */
public class StaticTest {
	
	public static void main(String[] args) {
		Car car = new Car();
		car.setBrand("宝马x6");
		car.name = "小轿车";
		//调用静态变量
		System.out.println(Car.name);
		
		System.out.println(car.name);
		
		Car car1 = new Car();
		System.out.println(car1.name);
		
		//调用静态方法
		Car.method();
	}

	  
}
