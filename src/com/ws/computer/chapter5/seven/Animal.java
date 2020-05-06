package com.ws.computer.chapter5.seven;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月6日下午4:16:20
 */
public  class Animal {
	
	public int age = 100 ;
	
	public String name = "小动物";
	
	
	public void eat(){
		System.out.println("动物需要吃饭....");
	}
	
	public Animal(){
		System.out.println("父类（Animal)的构造方法...");
	}
	
	//1.用final修饰的方法不能够被重写
	public  void method(){
		System.out.println("method方法....");
	}
	
	//2.final修饰的类，不能被继承。
	
	
	//3.final修饰的变量，只能被赋值一次。其实就是常量
	final int num = 1000 ;

	
	

}
