package com.ws.computer.chapter8.sevenandeight;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月15日上午11:09:18
 * 
 * 3.静态内部类；在成员内部类前面加上static关键字进行修饰。
 */
public class StaticClass {
	
	
	public  static  int n = 10 ; //成员变量
	
	static void method(){
		Inner  inner = new Inner();
		//外部类调用静态内部类的成员变量
		System.out.println(inner.m);
		//外部类调用静态内部类的成员方法。
		inner.test();
	}//成员方法
	
	
	//定义了一个静态内部类
	static class Inner{
		
		int  m = 100 ;
		void test(){
			//静态内部类只能调用外部类的静态变量
			System.out.println(n);
			//静态内部类只能调用外部类的静态成员方法
			method();
			System.out.println("静态内部类的成员方法....");
		}
		
	}
	
	
	

}
