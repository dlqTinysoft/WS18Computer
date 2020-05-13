package com.ws.computer.chapter8.fiveandsix;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月13日上午8:51:46
 * 
 * 1.成员内部类
 */
public class Outer {
	
	private String name = "Outer" ; //成员变量
	
	public void method(){
		//外部类访问成员内部类的方法和属性
		Inner inner = new Inner();
		System.out.println(inner.n);
		inner.test1();
		
	}//定义的成员方法
	
	//成员内部类
	class  Inner{
		
		int n = 10 ; //内部类的成员变量
		
		void test(){
			//访问外部类的成员变量
			System.out.println(name);
			//访问外部类的成员方法
			method();
			System.out.println("内部类的成员方法...");
		}
		
		void test1(){
			System.out.println("内部类的的成员方法...");
		}
		
		
	}
	
	
	

}
