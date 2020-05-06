package com.ws.computer.chapter6.fixandsix;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月6日上午9:00:01
 */
public interface  MyInterface {
	//interface来修饰，就代表我定义了个接口
	//jdk8
	//1.接口可以定义常量
	public static final int num = 10 ;
	public static final int age = 100  ;
	//2.接口里面定义抽象方法
	public  abstract  void eat() ;
	
	//3.不能定义普通方法
	//public void eat1(){}
	
	//4.jdk8 接口可以定义静态方法
	public static void eat1(){
		System.out.println("接口里面的静态方法...");
	}
	
	//5.定义普通方法怎么办？jdk8接口可以定义普通方法，但是有什么要求
	public  default void  info(){
		System.out.println("jdk8，提供定义并实现普通方法的形式。");
	}
	

}
