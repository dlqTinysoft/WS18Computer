package com.ws.computer.chapter7.oneandtwo;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月9日下午3:32:06
 */
public class Outer {
	
	int m = 100 ; 
	
	void show(){
		System.out.println("Outer类中的成员方法...");
	}
	
	
	//成员内部类
	class Inner{
		int n = 10 ;
		
		void test(){
			//访问外部类的属性
			System.out.println(m);
			//访问外部类的方法
			show();
		}
		
	}
	
	//外部类中访问内部类的属性和方法
	void test(){
		Inner inner = new Inner();
		System.out.println(inner.n);
		inner.test();
	}

}
