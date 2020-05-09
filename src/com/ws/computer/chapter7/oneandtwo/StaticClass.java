package com.ws.computer.chapter7.oneandtwo;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月9日下午3:39:52
 */
public class StaticClass {
	
	
	static int n = 100 ;
	
	 static void show(){
		System.out.println("外部类的方法");
	}
	
	
	//静态内部类，在成员内部类前面加上static 
	static class Inner{
		
		static int m = 100 ;
		
		void test(){
			System.out.println("静态内部类的方法....");
			System.out.println(n);
			show();
		}
	}

}
