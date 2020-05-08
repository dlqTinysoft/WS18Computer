package com.ws.computer.chapter6.seven;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月8日上午11:05:29
 * 定义了个接口
 */
public interface MyInterface {
	//1.什么是接口，怎么定义接口： 用interface关键字修饰的 就是接口。
	//javac编译的时候：  interface MyInterfae  -> MyInterface.class
	
	
	//2.jdk5之前（包含jdk5） 接口特性
	
	//2.1 接口里面只能定义常量（静态常量）
	public static final int age  = 100 ;
	
	public static final int num = 10 ;
	
	//2.2 接口里面只能定义抽象方法
	public abstract void eat();
	
	public abstract void run();
	
	//3.jdk8的接口新特性
	//3.1接口里面可以定义普通方法：1.静态方法   2. default
	
	//3.1定义静态方法在接口里面
	public  static void staticMethod(){
		System.out.println("接口中定义的静态方法");
	}
	
	//3.2 方法就要用default关键字来修饰
	public default void mehodDefault(){
		System.out.println("接口里面定义的default方法..");
	}
	
	//4.java里面遵循单继承 多实现。
	
	//5.java版本是向下兼容的  jdk14 > jdk8  > jdk5 
	
	
	
	
	
}
