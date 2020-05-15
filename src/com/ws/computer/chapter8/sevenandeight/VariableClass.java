package com.ws.computer.chapter8.sevenandeight;

/**
 * 作者： 董乐强
 * 邮箱：dlq_tinysoft@163.com
 * 时间：2020年5月15日上午11:05:45
 * 2.局部内部类：定义在方法里面的类
 */
public class VariableClass {
	
	
	//成员方法
	public void method(){
		
		//局部内部类：它的作用只在本方法范围内，出了方法就没有了
		class Inner{
			
			int m = 100 ;
			
			void test(){
				System.out.println("局部内部类的成员方法.....");
			}
			
		}
		
		//在该方法体new出局部内部类的对象
		Inner inner = new Inner();
		//调用局部内部类的成员变量
		System.out.println(inner.m);
		//调用局部内部类的成员方法。
		inner.test();
		
		
	}
	
	

}
