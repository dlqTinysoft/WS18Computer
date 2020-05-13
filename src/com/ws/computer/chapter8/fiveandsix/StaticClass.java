package com.ws.computer.chapter8.fiveandsix;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月13日上午9:05:11
 * 
 * 3.静态内部类：成员内部类前面加上static关键修饰
 */
public class StaticClass {
	
	private String name ; // 成员变量
	
	void method(){
		System.out.println("外部类的成员方法");
	}
	
	
	//定一个静态内部类
	 static class InnerTest{
		
		void method(){
			System.out.println("内部类的成员方法...");
		}
		
		
	}
	
	
	

}
