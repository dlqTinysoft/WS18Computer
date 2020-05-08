package com.ws.computer.chapter6.oneandtwo;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月8日上午9:01:14
 * 定义了一个接口
 */
public interface MyInterface {
	
	//1.怎么定义接口： 就用interface关键字。编译的时候， interface MyInterface  ->  MyInterface.class
	
	//2.jdk5之前，包括jdk5
	
	//2.1 接口里面只能定义常量
	public static final int age = 10 ;
	
	public static final int number = 23;
	
	//2.2 接口里面只能定义抽象方法
	public abstract void eat();
	
	
	//jdk8接口的新特性    jdk14 > jdk8 > jdk5   
	//在接口中可以定义普通方法，但是普通方法： 1.静态方法  2.default
	//3.1接口中定义静态方法
	public  static void methodJdk8(){
		System.out.println("接口中的静态方法...");
	}
	
	//3.2 接口中定义普通方法，前面需要加上default关键字
	public  default void methodJdk8D(){
		System.out.println("jdk8在接口中的新特性...");
	}
	
	
	
	
	

}
