package com.ws.computer.chapter8.sevenandeight;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月15日上午10:56:09
 * 1.成员内部类：在类里面又定义了一个类。
 */
public class Outer {
	
	//1.成员变量
	private  String name = "outer";
	
	//2.成员方法
	void method(){
		//2.外部类调用内部类的成员变量和成员方法，就需要new出内部类的对象
	
		Inner  inner = new Inner();
		//调用内部类的成员方法
		inner.test();
		//调用内部类的成员变量
		System.out.println(inner.m);
		
		System.out.println("外部类的成员方法...");
		
	}
	
	//3.类里面还可以定义类：成员内部类
	class Inner{
		
		public int m = 100;
		
		public void test(){
			System.out.println("成员内部类的方法...");
		}
		
		//1.在内部类里面可以调用外部类的成员变量和成员方法。不用new外部类对象。
		
		void  test1(){
			//调用外部类的 成员变量
			System.out.println(name);
			//调用外部类的成员方法
			method();
			
		}
	}
}
