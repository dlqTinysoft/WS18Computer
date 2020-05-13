package com.ws.computer.chapter8.threeanddfour;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月13日上午10:55:52
 * 
 * 1.成员内部类；在Outer类里面又定义了一个类
 */
public class Outer {
	
	//成员变量
	private String name = "outer";

	//成员方法
	public void method(){
		Inner inner = new Inner();
		//访问内部类的成员变量
		System.out.println(inner.n);
		//访问内部类的的成员方法
		inner.test1();
		System.out.println("外部类的成员方法....");
	}
	
	//成员内部类
	//1.成员内部类，不用new对象就可以访问外部类的成员变量和成员方法
	
	//2.外部类想访问内部类的成员变量和成员方法.
	
	public  class Inner{
		int n = 100 ;//内部类的成员变量
		
		//内部类的成员方法
		void test(){
			System.out.println(name);//访问外部的成员变量
			method();//访问外部的成员方法
			
			System.out.println("成员内部类方法...");
		}
		//内部类的成员方法
		void test1(){
			System.out.println("成员内部类方法...");
		}
		
	}
}
