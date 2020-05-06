package com.ws.computer.chapter6.ThreeandFour;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月6日上午11:03:28
 * 定义一个接口
 */
public interface MyInterface {
	
	//1.接口里面可以定义常量
	 public static final int age = 10;
	//2.接口里面只能定义抽象方法（jdk5之前，包含jdk5）
	 public abstract  void eat();
	 
	 //3.jdk8的新特性：接口里面可以定义静态方法
	 public  static void info(){
		 System.out.println("接口里面的静态方法...");
	 }
	 
	 //4.jdk8的新特性：接口里面也可以定义普通方法,普通方法前面要加上default关键字
	 public default void eat1(){
		 System.out.println("接口里面的default方法....");
	 }
	 
	

}
