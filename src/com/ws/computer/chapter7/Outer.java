package com.ws.computer.chapter7;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月9日下午1:00:22
 * 
 * 成员内部类
 */
public class Outer {
	
	//定义外部类成员变量
	 int m = 0 ;
	
	//定义外部类方法
	void show(){
		System.out.println("我是外部类的方法...");
	}
	
	//定义个成员内部类
	class Inner{
		
		int n = 10 ;
		
		void test(){
			//访问外部类的属性
			System.out.println(m);
			//访问外部类的方法
			show();
		}
	}
	
	//外部类的方法，访问内部类方法和属性
	void test(){
		Inner inner = new Inner();
		inner.test();
		System.out.println(inner.n);
	}
}
