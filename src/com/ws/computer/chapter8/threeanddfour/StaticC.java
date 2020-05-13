package com.ws.computer.chapter8.threeanddfour;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月13日上午11:08:40
 * 
 * 3.静态内部类：在成员内部类加上static关键字 进行修饰
 */
public class StaticC {
	
	
	public  String name = "staticC";
	
	public void method(){
		System.out.println("外部类的成员方法...");
	}
	
	//定以一个静态内部类
	
	static class Inner{
		
		private int age ;
		
		void show(){
			System.out.println("静态内部类的方法....");
		}
		
	}
	
	

}
